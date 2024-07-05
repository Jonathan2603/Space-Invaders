# Space Invaders Game

## Project Overview

This project implements a Space Invaders game in Java, applying various object-oriented design principles and patterns. The game demonstrates the use of Factory, Chain of Responsibility, Singleton patterns, and principles like Single Responsibility and Open-Closed Principle.

## Table of Contents

- [Project Overview](#project-overview)
- [Folder Structure](#folder-structure)
- [Installation](#installation)
- [Usage](#usage)
- [File Descriptions](#file-descriptions)
- [Object-Oriented Techniques](#object-oriented-techniques)
- [Contributing](#contributing)
- [License](#license)

## Folder Structure

```bash
Space-Invaders/
│
├── Alien.java
├── AlienCollisionHandler.java
├── Bullet.java
├── CollisionHandler.java
├── Game.java
├── GameObjectFactory.java
├── Main.java
├── PlayerLives.java
├── PlayerSpaceship.java
├── Score.java
```
## Installation

1. **Clone the repository:**

    ```bash
    git clone https://github.com/yourusername/space-invaders.git
    cd space-invaders
    ```

2. **Compile the files:**

    If your directory is `Assignment`, use:

    ```bash
    javac *.java
    ```

## Usage

To run the game, make sure the directory is the folder that contains `Assignment` and use:

```bash
java Assignment.Main
```

## File Descriptions

1.	**Alien.java**
- Implements the Factory pattern with the Alien class, created by AlienFactory.
- Demonstrates the Factory pattern by creating different types of aliens.
  
2.	**AlienCollisionHandler.java**
- Implements the Chain of Responsibility pattern with the AlienCollisionHandler class.
- Demonstrates the Chain of Responsibility pattern in handling collisions involving aliens.
  
3.	**Bullet.java**
- Represents game elements and their behavior (Element concept).
- Demonstrates the Single Responsibility principle by encapsulating element behavior.
  
4.	**CollisionHandler.java**
- Defines the CollisionHandler interface, used for implementing the Chain of Responsibility pattern in collision handling.
- Demonstrates the Open-Closed Principle by allowing new collision handlers to be added without modifying existing code.
  
5.	**Game.java**
- Represents the main game logic and functionality.
- Manages game objects, updates game state, and handles collisions.
- Uses the Singleton pattern with the GameManager class to ensure a single instance of the game manager.
  
6.	**GameObjectFactory.java**
- Defines the GameObjectFactory interface, used for implementing the Factory pattern.
- Demonstrates the Factory pattern for creating game objects.
  
7.	**Main.java**
- Serves as the entry point for the game.
- Contains the main method to start the game.
  
8.	**PlayerLives.java**
- Represents the concept of player lives.
- Contains functionality related to the player’s lives.
- Demonstrates the Single Responsibility principle.
  
9.	**PlayerSpaceship.java**
- Represents the player’s spaceship.
- Contains behavior and attributes specific to the player’s spaceship.
- Demonstrates the Single Responsibility principle.
  
10.	**Score.java**
- Manages the player’s score.
- Implements logic related to the player’s score.
- Demonstrates the Single Responsibility principle.

## Object-Oriented Techniques

- **Factory Pattern:**
  - Used for creating game objects (AlienFactory, BulletFactory, PlayerFactory).
- **Chain of Responsibility Pattern:**
	- Applied in collision handling (AlienCollisionHandler).
- **Singleton Pattern:**
  - Used with the GameManager class.
- **Open-Closed Principle:**
	- Demonstrated in the CollisionHandler interface, allowing new handlers to be added without modifying existing code.
- **Single Responsibility Principle:**
	- Followed in classes like Bullet, PlayerLives, and Score.

## Contact

If you have any questions or suggestions, feel free to reach out:

- Jonathan Nazareth
- Email: jgnazareth26@gmail.com
- LinkedIn: https://www.linkedin.com/in/jonathan-nazareth/
- GitHub: https://github.com/Jonathan2603
