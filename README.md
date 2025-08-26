# Minesweeper in Java

A console-based implementation of the classic **Minesweeper** game using **Java** and **Object-Oriented Programming (OOP)** principles.  
Developed as a personal project for practice and experimentation.

---

## 🕹️ Game Description
The program simulates the traditional **Minesweeper** logic:
- A 10x10 grid with randomly placed bombs.
- Numbers indicate how many bombs are adjacent to a given cell.
- The game ends when all safe cells are revealed or when a bomb is triggered.

---

## 🚀 How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/davi-peterson/minesweeper-java.git
   cd minesweeper-java

2. **Compile and run with Maven**:
    ```bash
    mvn clean compile
    mvn exec:java -Dexec.mainClass="minesweeper.App"

---

## 🛠️ Technologies
    - Java (JDK 17+ recommended)
    - Maven (for build and execution)

---

## 📂 Project Structure
    minesweeper-java/
    ├─ src/
    │  └─ main/
    │     └─ java/
    │        └─ minesweeper/
    │           ├─ CampoMinado.java
    │           └─ App.java
    ├─ minesweeper.dia
    ├─ minesweeper.png
    ├─ pom.xml
    └─ README.md


---

## 📝 Notes
    This project was created for learning purposes.

    It can be extended with:
     - A graphical interface (Swing/JavaFX).
     - Different grid sizes and difficulty levels.
     - Score tracking or multiplayer support.
