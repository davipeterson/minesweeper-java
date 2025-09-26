# 💣 Minesweeper: CampoMinado (Java)

A classic **Minesweeper** game implementation built in **Java**.

This project, named `CampoMinado` (Portuguese for "Minesweeper"), is a straightforward, console-based rendition of the popular logic puzzle game. It serves as a clear example of object-oriented design and basic algorithm implementation, covering core concepts like game board initialization, bomb placement, neighbor counting, and game state management.

## ✨ Features

* **Classic 10x10 Grid:** A standard-sized game board.
* **10 Strategically Placed Bombs:** The constant `TOTAL_BOMBAS` is set to 10. Bombs are randomly placed upon initialization, ensuring a unique challenge every time.
* **Neighbor Counting Logic:** Correctly calculates and displays the number of adjacent bombs for each safe cell.
* **Simple Console Interface:** Interacts with the user via standard input/output for quick, turn-based gameplay.
* **Game State Management:** Tracks the number of moves (`jogadas`) and the end of the game (`fimJogo`), triggered by hitting a bomb or clearing all non-bomb cells.

## 🛠️ Technology Stack

* **Language:** Java
* **Design:** UML Class Diagram provided for design clarity.

## 🚀 How to Run

### Prerequisites

* **Java Development Kit (JDK):** Version 8 or higher.

### Execution

1.  **Clone the Repository:**
    ```bash
    git clone [YOUR_REPOSITORY_URL]
    cd minesweeper-java
    ```
2.  **Compile and Run (Standard Java):**
    If compiling without Maven:
    ```bash
    # (Assuming you compile the .java files into a 'classes' directory)
    javac src/main/java/br/davipeterson/minesweeper/*.java -d classes
    java -cp classes br.davipeterson.minesweeper.App
    ```
3.  **Compile and Run (Maven):**
    If using a standard Maven project setup:
    ```bash
    mvn clean install
    mvn exec:java -Dexec.mainClass="br.davipeterson.minesweeper.App"
    ```

### Gameplay

The game runs in your console:

1.  The grid will be displayed, showing uncovered cells (numbers, space, or `*` if the game ends) and covered cells (`?`).
2.  The program will prompt you for the row (`lin:`) and column (`col:`) to uncover.
3.  Enter the row and column (0-9 for a 10x10 grid) and press Enter.
4.  The game continues until you hit a bomb (`*`) or successfully uncover 90 safe cells.

---

## 📁 Project Structure Overview

The core logic is contained within the `CampoMinado.java` class, which belongs to the package `br.davipeterson.minesweeper`.

### `CampoMinado` Class Details

The `CampoMinado` class manages the state of the game:

| Member | Type | Visibility | Description |
| :--- | :--- | :--- | :--- |
| `TOTAL_BOMBAS` | `int` | `public static final` | Constant: The total number of bombs (10). |
| `gabarito` | `char[10][10]` | `private` | The solution board, holding bomb locations and neighbor counts. |
| `visual` | `char[10][10]` | `private` | The visible board, holding covered (`?`) or uncovered values. |
| `jogadas` | `int` | `private` | The number of successful moves made. |
| `fimJogo` | `boolean` | `private` | Flag indicating if the game has ended (win or loss). |
| `CampoMinado()` | Constructor | `public` | Initializes both boards, places the bombs, and calculates neighbor counts. |
| `desarme(l, c)` | `void` | `public` | Performs a move at coordinates `l` (row) and `c` (column). Checks for a win/loss condition. |
| `imprime()` | `void` | `public` | Prints the `visual` board to the console. |
| `getJogadas()` | `int` | `public` | Getter for the current move count. |
| `getFimJogo()` | `boolean` | `public` | Getter for the game end state. |

---

## 🤝 Contribution & License

### License

This project is licensed under the **MIT License**. See the `LICENSE` file for details.

### Contribution

Feel free to **fork** the repository and suggest improvements! This basic structure is ripe for enhancements such as:

* Adding a flagging feature.
* Implementing recursive uncovering of empty cells (zero neighbors).
* Creating different difficulty levels (board sizes, bomb counts).
* Implementing a graphical user interface (GUI).