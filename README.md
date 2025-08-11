                                                                                                                        # java-practice



One-line description: A collection of Java practice exercises, examples and small projects to learn and demonstrate Java fundamentals, algorithms, data structures and common programming patterns.

Table of Contents
- About
- Repository Structure
- Key Topics Covered
- Prerequisites
- Build & Run
  - Using javac/java
  - Using Maven
  - Using Gradle
- Example
- Contributing
- How to add a new exercise
- Tests
- Contact

About
This repository is intended for practicing Java: small exercises, algorithm implementations, data structure examples, and mini-projects. Use it to learn, practice interview questions, or showcase your skills.

Repository structure (example)
- /algorithms — Sorting, searching, recursion, greedy, dynamic programming
- /data-structures — Implementations: linked list, stack, queue, tree, graph
- /projects — Small apps (e.g., CLI tools, games, utilities)
- /patterns — Design pattern examples
- /utils — Shared helper classes
- /tests — Unit tests (if present)

(Replace or update the structure above to reflect your actual repo folders.)

Key Topics Covered
- Core Java: OOP, exceptions, collections, generics
- Algorithms: sorting, searching, recursion, dynamic programming
- Data Structures: arrays, linked lists, trees, graphs, hash maps
- Design patterns and principles
- Small practical projects and exercises

Prerequisites
- Java JDK 8+ (or specify the version you use)
- Optional: Maven or Gradle if the project uses one of these build tools
- Git (to clone the repo)

Build & Run

1) Clone the repo
git clone https://github.com/BAAESEMOHAMMADWAALI/java-practice.git
cd java-practice

2) Using plain javac/java (for single-file or simple packages)
- Compile:
  javac -d out src/path/to/YourMain.java
- Run:
  java -cp out fully.qualified.MainClass

3) Using Maven (if a module uses Maven)
- Build:
  mvn clean package
- Run a main class with exec plugin (example):
  mvn compile exec:java -Dexec.mainClass="com.example.Main"

4) Using Gradle (if a module uses Gradle)
- Build:
  ./gradlew build
- Run:
  ./gradlew run --args='arg1 arg2'
  (or configure mainClass in build.gradle)

Example (running a sample exercise)
Assume there is a package com.example.sorting with Main.java:
- javac:
  javac -d out src/com/example/sorting/Main.java
  java -cp out com.example.sorting.Main
- Maven:
  cd algorithms/sorting
  mvn compile exec:java -Dexec.mainClass="com.example.sorting.Main"

Contributing
Contributions are welcome! Suggested workflow:
1. Fork the repo
2. Create a feature branch: git checkout -b feature/your-feature
3. Add your code and tests
4. Commit and push: git push origin feature/your-feature
5. Open a Pull Request describing your changes

Guidelines:
- Add readable code with comments as needed
- Include unit tests where applicable
- Keep exercises small and focused
- Follow consistent naming and package conventions

How to add a new exercise
1. Create a new folder under the appropriate category (e.g., algorithms/sorting/quick-sort)
2. Add a clear README for the exercise that explains the problem, complexity, and sample input/output
3. Add implementation (Main class or library classes)
4. Add unit tests in the /tests folder or alongside the code
5. Update this README or an index file listing available exercises

Tests
- If tests are present, run them with:
  - Maven: mvn test
  - Gradle: ./gradlew test
  - JUnit (plain): run via IDE or classpath



Contact
Author: BAAESEMOHAMMADWAALI (GitHub: https://github.com/BAAESEMOHAMMADWAALI)
Email: baaesemohdwaali@gmail.com


