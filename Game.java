package Assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the main game class responsible for managing game state.
 */
public class Game {
    private PlayerSpaceship playerSpaceship;
    private List<Alien> aliens;
    private List<Bullet> bullets;
    private CollisionHandler collisionHandler;
    private Score score;
    private PlayerLives playerLives;

    /**
     * Constructor to initialize the game.
     */
    public Game() {
        playerSpaceship = GameObjectFactory.createPlayerSpaceship(250, 500, 3);
        aliens = new ArrayList<>();
        bullets = new ArrayList<>();
        collisionHandler = new AlienCollisionHandler(aliens).setNextHandler(collisionHandler/* Create the next collision handler */);
        score = Score.getInstance();
        playerLives = PlayerLives.getInstance();
    }

    /**
     * Runs the main game loop.
     */
    public void runGame() {
        // Example: Game loop
        while (playerLives.getLives() > 0) {
            // Update game state
            playerSpaceship.updatePosition();
            for (Alien alien : aliens) {
                alien.move();
            }
            for (Bullet bullet : bullets) {
                bullet.updatePosition();
            }

            // Check collisions
            checkCollisions();

            // Remove off-screen elements if needed

            // Render the game (stub for drawing to the screen)

            // Receive player input (stub for input handling)

            // Make a sound (stub for playing a sound)

            // Print the current score
            System.out.println("Score: " + score.getScore());

            // Sleep for a short duration to control the game loop speed
            try {
                Thread.sleep(16); // Adjust as needed for desired frame rate
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // Example: Game over logic
        System.out.println("Game Over!");
    }

    /**
     * Checks collisions between game elements.
     */
    private void checkCollisions() {
        // Collision checking logic
        for (Alien alien : aliens) {
            collisionHandler.handleCollision(playerSpaceship, alien);
            for (Bullet bullet : bullets) {
                collisionHandler.handleCollision(bullet, alien);
            }
        }
        // Add more collision checks if needed
    }

    /**
     * Example method to add a new bullet to the game.
     */
    public void addBullet(Bullet bullet) {
        bullets.add(bullet);
    }

    /**
     * Example method to add a new alien to the game.
     */
    public void addAlien(Alien alien) {
        aliens.add(alien);
    }
}
