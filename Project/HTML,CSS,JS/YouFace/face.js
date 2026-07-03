const nav = performance.getEntriesByType("navigation")[0];
if (nav && nav.type === "reload") {
    sessionStorage.clear();
}

let girl=document.querySelector(".girl-gender");
let boy=document.querySelector(".boy-gender");
let gender=null

if(girl && boy){
    girl.addEventListener("click",()=>{
    sessionStorage.setItem("gender","F");
});
boy.addEventListener("click",()=>{
    sessionStorage.setItem("gender","M");
});
}


let input=document.querySelector(".name");
let sub=document.querySelector(".submit");
let photo=document.querySelector(".box");
let value=""
let text=document.querySelector(".tit");
if(input && sub){
    sub.addEventListener("click",()=>{
        value=input.value;
        if(value[0].toUpperCase()>="A" && value[0].toUpperCase()<="Z"){
           const  gender = sessionStorage.getItem("gender");
                        text.innerText=`This is you ${value} 🤗`;
                        text.style.color="red"; 
            if(
                (value[0].toUpperCase()=="A" ||
                    value[0].toUpperCase()=="E"||
                    value[0].toUpperCase()=="I" ||
                    value[0].toUpperCase()=="N"||
                    value[0].toUpperCase()=="R" ||
                    value[0].toUpperCase()=="V")
                     && gender=="F")
                     {
                 photo.setAttribute("src","meme/g1.png");
             }
            else if(
                (value[0].toUpperCase()=="B" ||
                    value[0].toUpperCase()=="F"||
                    value[0].toUpperCase()=="J" ||
                    value[0].toUpperCase()=="O"||
                    value[0].toUpperCase()=="S" ||
                    value[0].toUpperCase()=="W")
                     && gender=="F")
                     {
                 photo.setAttribute("src","meme/g2.png");
             }     
            else if(
                (value[0].toUpperCase()=="C" ||
                    value[0].toUpperCase()=="G"||
                    value[0].toUpperCase()=="K" ||
                    value[0].toUpperCase()=="P"||
                    value[0].toUpperCase()=="T" ||
                    value[0].toUpperCase()=="X")
                     && gender=="F")
                     {
                 photo.setAttribute("src","meme/g3.png");
             }               
            else if(
                (value[0].toUpperCase()=="D" ||
                    value[0].toUpperCase()=="H"||
                    value[0].toUpperCase()=="L" ||
                    value[0].toUpperCase()=="Q"||
                    value[0].toUpperCase()=="U" ||
                    value[0].toUpperCase()=="Y")
                     && gender=="F")
                     {
                 photo.setAttribute("src","meme/g4.png");
             }   
             else if(
                (value[0].toUpperCase()=="A" ||
                    value[0].toUpperCase()=="E"||
                    value[0].toUpperCase()=="I" ||
                    value[0].toUpperCase()=="N"||
                    value[0].toUpperCase()=="R" ||
                    value[0].toUpperCase()=="V" ||
                    value[0].toUpperCase()=="V")
                     && gender=="M")
                     {
                 photo.setAttribute("src","meme/b1.png");
             }
            else if(
                (value[0].toUpperCase()=="B" ||
                    value[0].toUpperCase()=="F"||
                    value[0].toUpperCase()=="J" ||
                    value[0].toUpperCase()=="O"||
                    value[0].toUpperCase()=="S" ||
                    value[0].toUpperCase()=="W"||
                    value[0].toUpperCase()=="M")
                    && gender=="M")
                     {
                 photo.setAttribute("src","meme/b2.png");
             }     
            else if(
                (value[0].toUpperCase()=="C" ||
                    value[0].toUpperCase()=="G"||
                    value[0].toUpperCase()=="K" ||
                    value[0].toUpperCase()=="P"||
                    value[0].toUpperCase()=="T" ||
                    value[0].toUpperCase()=="X")
                     && gender=="M")
                     {
                 photo.setAttribute("src","meme/b3.png");
             }               
            else if(
                (value[0].toUpperCase()=="D" ||
                    value[0].toUpperCase()=="H"||
                    value[0].toUpperCase()=="L" ||
                    value[0].toUpperCase()=="Q"||
                    value[0].toUpperCase()=="U" ||
                    value[0].toUpperCase()=="Y")
                     && gender=="M")
                     {
                 photo.setAttribute("src","meme/b4.png");
             }    
            else if(value[0].toUpperCase()=="M" && gender=="F"){
                 photo.setAttribute("src","meme/g5.png");
             } 
   
                 }
        else{
            alert("enter name correctly!");
            value="";
        }
    })
}
