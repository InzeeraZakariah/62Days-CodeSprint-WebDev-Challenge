# ⌨️ Typing Speed Test

A clean, responsive **Typing Speed Test** web application built using **HTML, CSS, and JavaScript**. It measures your typing speed (WPM), accuracy, and error count in real time, with full **Light/Dark mode** support.

## ✨ Features

- 🔤 Randomly generated text on every test
- ⏱️ Selectable test duration — 15s / 30s / 60s / 120s
- 📊 Live stats while typing: **WPM**, **Accuracy %**, **Errors**, **Time Left**
- ✅ Real-time character highlighting (correct / incorrect / current position)
- 🌙 Light & Dark mode toggle (remembers your preference using `localStorage`)
- 📱 Fully responsive — works smoothly on mobile, tablet, and desktop
- 🏁 Result summary modal at the end of each test
- 🔄 Restart / Try Again option anytime

## 🛠️ Tech Stack

- **HTML5** — Structure
- **CSS3** — Styling, responsive layout, light/dark theme variables
- **JavaScript (Vanilla)** — Typing logic, timer, WPM/accuracy calculation, theme toggle

## 📂 Folder Structure

```
Typing-Speed-Test/
├── index.html
├── style.css
├── script.js
└── README.md
```

## 🚀 How to Run

This is a static front-end project — no installation or build steps required.

1. Download or clone this folder
2. Open `index.html` directly in any modern web browser (Chrome, Firefox, Edge)
3. Click inside the text box and start typing to begin the test automatically

## 🎯 How It Works

1. A random paragraph is generated when the page loads
2. The timer starts the moment you begin typing
3. Each character you type is checked against the target text:
   - ✅ Green = correct
   - ❌ Red highlight = incorrect
4. **WPM** is calculated using the standard formula: `(characters typed / 5) / minutes elapsed`
5. When time runs out (or you finish the full text), a results popup shows your final WPM, accuracy, errors, and total characters typed

## 📸 Screenshot

### Light Mode

![Light Mode](screenshot-light.png)

### Dark Mode

![Dark Mode](screenshot-dark.png)

## 🙌 Contribution

This project was built as part of the **62Days-CodeSprint-WebDev-Challenge** under **SSoC'26**.

## 📄 License

Free to use for learning purposes.
