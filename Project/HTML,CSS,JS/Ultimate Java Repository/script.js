// Primary framework configuration pairing UI layouts to curriculum folders (Java-focused)
const topicsData = {
    "Core Foundations": {
        mdFile: "Core Foundations Overview.md",
        subtopics: [
            { name: "Variables", path: "Variables" },
            { name: "Type Casting", path: "Type_Casting.java" },
            { name: "Access Modifiers", path: "Access_Modifiers.java" },
            { name: "Wrapper Classes", path: "Wrapper_Class.java" },
            { name: "Auto-Boxing and Auto-Unboxing", path: "Auto_Boxing_and_Auto_Unboxing.java" }
        ]
    },
    "Conditional and Looping Statements": {
        mdFile: "Control Flow Overview.md",
        subtopics: [
            { name: "Conditional Statements", path: "Conditional Statements" },
            { name: "Looping Statements", path: "Looping Statements" }
        ]
    },
    "Data Structures": {
        mdFile: "Data Structures and Methods Overview.md",
        subtopics: [
            { name: "Arrays", path: "Arrays" },
            { name: "Strings", path: "Strings" },
            { name: "Methods", path: "Methods" }
        ]
    },
    "Object-Oriented Programming (OOP)": {
        mdFile: "OOP Overview.md",
        subtopics: [
            { name: "Classes", path: "OOP/Classes" },
            { name: "Objects", path: "OOP/Objects" },
            { name: "Constructors", path: "OOP/Constructors" },
            { name: "Inheritance", path: "OOP/Inheritance" },
            { name: "Interfaces", path: "OOP/Interfaces" },
            { name: "Polymorphism", path: "OOP/Polymorphism" },
            { name: "Method Overloading and Overriding", path: "Method Overloading and Overriding" },
            { name: "Exception Handling", path: "Exception Handling" },
            { name: "Threads and Runnable", path: "Threads and Runnable" }
        ]
    },
    "Java Database Connectivity (JDBC)": {
        mdFile: "JDBC Overview.md",
        subtopics: [
            { name: "JDBC Examples", path: "JDBC (Java Database Connectivity)" }
        ]
    },
    "General Examples": {
        mdFile: "Examples Overview.md",
        subtopics: [
            { name: "General Examples", path: "Examples" }
        ]
    }
};

const subtopicTitle = document.getElementById('current-subtopic-title');
const programsContainer = document.getElementById('programs-container');
const sidebarTreeWrapper = document.getElementById('sidebar-tree-wrapper');

let globalRepositoryTreeFlatArray = [];

document.addEventListener('DOMContentLoaded', async () => {
    buildDropdownMenus();
    setupInlineContentLinks();
    setupParentTopicLinks();
    await initializeRepositoryTreeMap();
    checkUrlHashRoute();
});

async function initializeRepositoryTreeMap() {
    try {
        const response = await fetch('tree_manifest.json');
        if (!response.ok) throw new Error("Could not find tree_manifest.json");
        globalRepositoryTreeFlatArray = await response.json();
    } catch (err) {
        console.error("Blueprint layout generation loading exception:", err);
    }
}

function buildDropdownMenus() {
    document.querySelectorAll('.dropdown-menu').forEach(menu => {
        const topicKey = menu.getAttribute('data-topic');
        const subtopics = topicsData[topicKey].subtopics || [];

        subtopics.forEach(sub => {
            const li = document.createElement('li');
            li.className = 'dropdown-item';
            li.textContent = sub.name;
            li.addEventListener('click', (e) => {
                e.stopPropagation();
                window.location.hash = `${encodeURIComponent(topicKey)}:${encodeURIComponent(sub.path)}`;
            });
            menu.appendChild(li);
        });
    });
}

function setupInlineContentLinks() {
    document.querySelectorAll('.page-link').forEach(link => {
        link.addEventListener('click', (e) => {
            e.preventDefault();
            const parentTopic = link.getAttribute('data-parent');
            let targetPath = link.getAttribute('data-path');
            if (targetPath === "If-Else-Elif") targetPath = "If-Else-Elif Statements";
            if (targetPath === "Error Handling") targetPath = "Try-Except-Finally Statements";
            window.location.hash = `${encodeURIComponent(parentTopic)}:${encodeURIComponent(targetPath)}`;
        });
    });
}

function setupParentTopicLinks() {
    document.querySelectorAll('.nav-topic-title').forEach(titleSpan => {
        titleSpan.addEventListener('click', () => {
            const topicKey = titleSpan.getAttribute('data-topic');
            window.location.hash = `${encodeURIComponent(topicKey)}:all`;
        });
    });
}

function updateBrowserTabTitle(viewName) {
    document.title = `${viewName} | ♨️ Ultimate Java Repository`;
}

async function checkUrlHashRoute() {
    const currentHash = window.location.hash.replace('#', '');

    // Clear previous selections on any hash change
    document.querySelectorAll('.sidebar-link.selected, .sidebar-sub-link.selected').forEach(link => {
        link.classList.remove('selected');
    });

    if (!currentHash) {
        document.title = "Ultimate Java Repository";
        return; 
    }

    if (currentHash.startsWith('section_')) {
        const element = document.getElementById(currentHash);
        if (element) {
            element.scrollIntoView({ behavior: 'smooth', block: 'start' });
        } else {
            setTimeout(() => {
                const retryElement = document.getElementById(currentHash);
                if (retryElement) retryElement.scrollIntoView({ behavior: 'smooth', block: 'start' });
            }, 300);
        }

        // Highlight the corresponding link in the sidebar
        const activeLink = document.querySelector(`a[href="#${currentHash}"]`);
        if (activeLink && (activeLink.classList.contains('sidebar-link') || activeLink.classList.contains('sidebar-sub-link'))) {
            activeLink.classList.add('selected');
        }

        return;
    }

    const segments = currentHash.split(':');
    if (segments.length !== 2) return;

    const topicKey = decodeURIComponent(segments[0]);
    const routeTarget = decodeURIComponent(segments[1]);

    if (!topicsData[topicKey]) return;

    if (routeTarget === 'all') {
        await triggerParentTopicLoad(topicKey);
    } else {
        const sub = topicsData[topicKey].subtopics.find(s => s.path === routeTarget);
        if (sub) await triggerContentLoad(topicKey, sub);
    }
}

window.addEventListener('hashchange', checkUrlHashRoute);

async function triggerParentTopicLoad(topicKey) {
    updateBrowserTabTitle(topicKey);
    document.getElementById('main-split-layout').classList.remove('home-view');
    subtopicTitle.textContent = topicKey;
    programsContainer.innerHTML = '<p class="placeholder-text">Rendering overview streams...</p>';
    sidebarTreeWrapper.innerHTML = '';

    const parentObj = topicsData[topicKey];
    const rootUL = document.createElement('ul');
    rootUL.className = 'sidebar-list';
    sidebarTreeWrapper.appendChild(rootUL);

    if (parentObj.mdFile) {
        const safeId = generateSafeElementId(parentObj.mdFile);
        const sideLI = document.createElement('li');
        sideLI.className = 'sidebar-item';
        sideLI.innerHTML = `<a href="#${safeId}" class="sidebar-sub-link overview-link selected">📖 ${topicKey} Overview</a>`;
        rootUL.appendChild(sideLI);

        programsContainer.innerHTML = ''; 
        await fetchAndRenderCode(parentObj.mdFile, parentObj.mdFile, programsContainer, safeId);
    } else {
        programsContainer.innerHTML = '';
    }

    for (const sub of parentObj.subtopics) {
        const parentSafeId = generateSafeElementId(sub.path);
        const masterLI = document.createElement('li');
        masterLI.className = 'sidebar-item';
        masterLI.style.marginTop = "1rem";

        const headerRow = document.createElement('div');
        headerRow.className = 'sidebar-header-row';
        headerRow.innerHTML = `<span class="arrow-icon expanded">▼</span><a href="#${parentSafeId}" class="sidebar-link" style="color: #ffffff;">💡 ${sub.name}</a>`;

        const subUL = document.createElement('ul');
        subUL.className = 'sidebar-nested-sublist show';

        headerRow.addEventListener('click', (e) => {
            const arrow = headerRow.querySelector('.arrow-icon');
            if (arrow) arrow.classList.toggle('expanded');
            subUL.classList.toggle('show');
            window.location.hash = parentSafeId;
        });

        const interiorLink = headerRow.querySelector('.sidebar-link');
        if (interiorLink) {
            interiorLink.addEventListener('click', (e) => {
                e.preventDefault();
            });
        }

        masterLI.appendChild(headerRow);
        masterLI.appendChild(subUL);
        rootUL.appendChild(masterLI);

        const subTopicDivider = document.createElement('h2');
        subTopicDivider.id = parentSafeId;
        subTopicDivider.className = 'nested-folder-title';
        subTopicDivider.style.fontSize = '1.6rem';
        subTopicDivider.style.borderBottom = '3px solid #4df3a9';
        subTopicDivider.textContent = sub.name;
        programsContainer.appendChild(subTopicDivider);

        const containerWrapper = document.createElement('div');
        programsContainer.appendChild(containerWrapper);

        await resolveAndBuildContent(sub.path, containerWrapper, subUL, sub.preferredOrder || []);
    }
}

async function triggerContentLoad(topicKey, subtopicObj) {
    updateBrowserTabTitle(subtopicObj.name);
    document.getElementById('main-split-layout').classList.remove('home-view');
    subtopicTitle.textContent = `${topicKey} ➔ ${subtopicObj.name}`;
    programsContainer.innerHTML = '<p class="placeholder-text">Rendering resources...</p>';
    sidebarTreeWrapper.innerHTML = '';
    
    const rootUL = document.createElement('ul');
    rootUL.className = 'sidebar-list';
    sidebarTreeWrapper.appendChild(rootUL);

    programsContainer.innerHTML = '';
    await resolveAndBuildContent(subtopicObj.path, programsContainer, rootUL, subtopicObj.preferredOrder || []);
}

function cleanDisplayName(rawName) {
    return rawName.replace(/\.(java|md|png|jpg|jpeg)$/i, '').replace(/^\d+_/g, '');
}

function getSectionHeadingForFile(filePath, fileName) {
    const cleanName = cleanDisplayName(fileName);
    return cleanName;
}

function generateSafeElementId(rawString) {
    return 'section_' + rawString.replace(/[^a-zA-Z0-9]/g, '_').toLowerCase();
}

async function resolveAndBuildContent(folderPath, targetContainer, currentSidebarUL, preferredOrder = []) {
    const prefix = folderPath + "/";
    
    let immediateContents = globalRepositoryTreeFlatArray.filter(item => {
        if (!item.path.startsWith(prefix)) return false;
        const relativePart = item.path.substring(prefix.length);
        return !relativePart.includes('/');
    });

    if (preferredOrder.length > 0) {
        immediateContents.sort((a, b) => {
            const nameA = a.path.split('/').pop();
            const nameB = b.path.split('/').pop();
            const cleanA = cleanDisplayName(nameA);
            const cleanB = cleanDisplayName(nameB);

            let idxA = preferredOrder.findIndex(r => r === nameA || r === cleanA);
            let idxB = preferredOrder.findIndex(r => r === nameB || r === cleanB);

            if (idxA !== -1 && idxB !== -1) return idxA - idxB;
            if (idxA !== -1) return -1;
            if (idxB !== -1) return 1;
            return nameA.localeCompare(nameB);
        });
    }

    // If there's a .md file in this folder, skip standalone .png blobs (they're embedded in the markdown)
    const hasMarkdown = immediateContents.some(i => i.type === "blob" && i.path.toLowerCase().endsWith('.md'));
    
    for (const item of immediateContents) {
        const itemRealName = item.path.split('/').pop();
        const safeId = generateSafeElementId(item.path);
        const displayName = cleanDisplayName(itemRealName);

        if (item.type === "blob") { 
            const lowerName = itemRealName.toLowerCase();
            if (lowerName.endsWith('.java') || lowerName.endsWith('.md') || lowerName.endsWith('.png')) {
                
                // Skip PNGs if there's a markdown file in the same folder (images are embedded in MD)
                if (lowerName.endsWith('.png') && hasMarkdown) continue;

                const li = document.createElement('li');
                li.className = 'sidebar-item';
                li.innerHTML = `<a href="#${safeId}" class="sidebar-sub-link">📄 ${displayName}</a>`;
                currentSidebarUL.appendChild(li);

                if (lowerName.endsWith('.java') || lowerName.endsWith('.md')) {
                    await fetchAndRenderCode(itemRealName, item.path, targetContainer, safeId);
                } else if (lowerName.endsWith('.png')) {
                    renderImageBlock(itemRealName, item.path, targetContainer, safeId);
                }
            }
        } 
        else if (item.type === "tree") { 
            const internalChildren = globalRepositoryTreeFlatArray.filter(child => child.path.startsWith(item.path + "/"));
            
            // Determine if this folder has a markdown file (PNGs alongside it are embedded, so skip them)
            const hasMd = internalChildren.some(c => c.type === "blob" && c.path.toLowerCase().endsWith('.md'));
            const nonPngBlobs = internalChildren.filter(c => c.type === "blob" && !c.path.toLowerCase().endsWith('.png'));

            // Single-file folder flattening mechanic:
            // Also flatten if there's exactly 1 .md/.py file and all other blobs are PNGs (embedded in markdown)
            // Exception: never flatten the Event Handling folder — this keeps "On Mouse Click" under an "Event Handling" folder
            const shouldFlatten = 
                displayName !== "Event Handling" &&
                ((internalChildren.length === 1 && internalChildren[0].type === "blob") ||
                (hasMd && nonPngBlobs.length === 1 && nonPngBlobs[0].type === "blob"));

            if (shouldFlatten) {
                const singleItem = hasMd ? nonPngBlobs[0] : internalChildren.find(c => c.type === "blob");
                const singleRealName = singleItem.path.split('/').pop();
                const singleSafeId = generateSafeElementId(singleItem.path);
                const singleDisplayName = cleanDisplayName(singleRealName);

                const li = document.createElement('li');
                li.className = 'sidebar-item';
                li.innerHTML = `<a href="#${singleSafeId}" class="sidebar-sub-link">📄 ${singleDisplayName}</a>`;
                currentSidebarUL.appendChild(li);

                // Add section heading for flattened single files
                const singleFileHeading = document.createElement('h3');
                singleFileHeading.className = 'nested-folder-title';
                singleFileHeading.id = singleSafeId;
                singleFileHeading.textContent = getSectionHeadingForFile(singleItem.path, singleRealName);
                targetContainer.appendChild(singleFileHeading);

                if (singleRealName.toLowerCase().endsWith('.java') || singleRealName.toLowerCase().endsWith('.md')) {
                    await fetchAndRenderCode(singleRealName, singleItem.path, targetContainer, singleSafeId);
                } else {
                    renderImageBlock(singleRealName, singleItem.path, targetContainer, singleSafeId);
                }
            } else {
                // Multi-program dropdown folder layout
                const masterLI = document.createElement('li');
                masterLI.className = 'sidebar-item';
                
                const headerRow = document.createElement('div');
                headerRow.className = 'sidebar-header-row';
                // Style adjustment to make the row surface visually feel like an active button layout option
                headerRow.style.cursor = 'pointer'; 
                headerRow.innerHTML = `<span class="arrow-icon">▶</span><a href="#${safeId}" class="sidebar-link">📁 ${displayName}</a>`;
                
                const subUL = document.createElement('ul');
                subUL.className = 'sidebar-nested-sublist';
                
                // Clicking anywhere on the entire container option now navigates and expands the dropdown menu list
                headerRow.addEventListener('click', (e) => {
                    const arrow = headerRow.querySelector('.arrow-icon');
                    if (arrow) arrow.classList.toggle('expanded');
                    subUL.classList.toggle('show');
                    
                    // Manually trigger hash relocation navigation jump when row box panel target surfaces are clicked
                    window.location.hash = safeId;
                });

                // Prevent the raw text link inside from causing double route tracking jumps
                const interiorLink = headerRow.querySelector('.sidebar-link');
                if (interiorLink) {
                    interiorLink.addEventListener('click', (e) => {
                        e.preventDefault();
                    });
                }

                masterLI.appendChild(headerRow);
                masterLI.appendChild(subUL);
                currentSidebarUL.appendChild(masterLI);

                const subHeading = document.createElement('h3');
                subHeading.className = 'nested-folder-title';
                subHeading.id = safeId;
                subHeading.textContent = `📁 ${displayName}`;
                targetContainer.appendChild(subHeading);

                const nestedGroupContainer = document.createElement('div');
                nestedGroupContainer.className = 'nested-group-container';
                targetContainer.appendChild(nestedGroupContainer);

                await resolveAndBuildContent(item.path, nestedGroupContainer, subUL, []);
            }
        }
    }
}

async function fetchAndRenderCode(fileName, downloadUrl, containerElement, elementId) {
    try {
        const response = await fetch(downloadUrl);
        if (!response.ok) throw new Error("File content mismatch.");
        const textData = await response.text();

        const block = document.createElement('div');
        block.className = 'program-block';
        block.id = elementId; 

        const header = document.createElement('div');
        header.className = 'program-header';
        header.textContent = cleanDisplayName(fileName);
        block.appendChild(header);

        if (fileName.toLowerCase().endsWith('.md')) {
            header.textContent = cleanDisplayName(fileName);
            const mdWrapper = document.createElement('div');
            mdWrapper.className = 'markdown-body-render';
            mdWrapper.innerHTML = marked.parse(textData);
            block.appendChild(mdWrapper);
        } else {
            const pre = document.createElement('pre');
            pre.className = "language-java"; 
            
            const code = document.createElement('code');
            code.className = "language-java";
            code.textContent = textData; 

            pre.appendChild(code);
            block.appendChild(pre);
            
            Prism.highlightElement(code);
        }

        containerElement.appendChild(block);
    } catch (err) {
        console.error(err);
    }
}

function renderImageBlock(fileName, downloadUrl, containerElement, elementId) {
    const block = document.createElement('div');
    block.className = 'program-block repo-image-block';
    block.id = elementId;
    block.style.padding = '1.5rem';
    block.style.display = 'flex';
    block.style.flexDirection = 'column';
    block.style.gap = '1rem';
    block.style.alignItems = 'center';
    block.style.borderRadius = '0';

    const header = document.createElement('div');
    header.className = 'program-header';
    header.style.width = '100%';
    header.style.margin = '-1.5rem -1.5rem 0 -1.5rem';
    header.style.padding = '0.85rem 1.5rem';
    header.textContent = cleanDisplayName(fileName);

    const img = document.createElement('img');
    img.src = downloadUrl;
    img.alt = fileName;
    img.style.maxWidth = '100%';
    img.style.height = 'auto';
    img.style.borderRadius = '0';
    img.style.border = '1px solid #1c2541';

    block.appendChild(header);
    block.appendChild(img);
    containerElement.appendChild(block);
}

// --- To Top Button ---
const toTopBtn = document.getElementById('to-top');

toTopBtn.addEventListener('click', () => {
    window.scrollTo({ top: 0, behavior: 'smooth' });
});

window.addEventListener('scroll', () => {
    if (window.scrollY > 300) {
        toTopBtn.classList.add('visible');
    } else {
        toTopBtn.classList.remove('visible');
    }
});