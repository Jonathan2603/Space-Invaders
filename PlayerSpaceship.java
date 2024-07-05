package Assignment;

/**
 * Represents the player's spaceship, a subclass of Element.
 */
public class PlayerSpaceship extends Element {
    private int lives;

    /**
     * Constructor to initialize the player spaceship.
     *
     * @param x      Initial x-coordinate.
     * @param y      Initial y-coordinate.
     * @param lives Initial lives.
     */
    public PlayerSpaceship(int x, int y, int lives) {
        // Initialize the player spaceship with a specific width, height, initial velocity, and lives
        super(x, y, 50, 30, 0, 0);
        this.lives = lives;
    }

    /**
     * Gets the lives of the player's spaceship.
     *
     * @return The current lives value.
     */
    public int getLives() {
        return lives;
    }

    /**
     * Decreases the lives of the player's spaceship.
     *
     * @param damage The amount of damage to be applied.
     */
    public void decreaselives(int damage) {
        lives -= damage;
        if (lives < 0) {
            lives = 0;
        }
    }

    /**
     * Handles player input to move the spaceship left.
     */
    public void moveLeft() {
        // Adjust the velocity or directly update the position based on input
        velocityX = -5;
    }

    /**
     * Handles player input to move the spaceship right.
     */
    public void moveRight() {
        // Adjust the velocity or directly update the position based on input
        velocityX = 5;
    }

    /**
     * Updates the position of the player's spaceship based on its velocity.
     */
    public void updatePosition() {
        // Update the position based on the velocity (e.g., in the game loop)
        x += velocityX;
        y += velocityY;
    }

    /**
     * Handles player input to stop horizontal movement.
     */
    public void stopHorizontalMovement() {
        // Stop horizontal movement by setting velocityX to 0
        velocityX = 0;
    }

    /**
     * Handles player input to shoot bullets.
     *
     * @return A new Bullet object representing the shot bullet.
     */
    public Bullet shoot() {
        // Create and return a new Bullet object with appropriate initial position and velocity
        return new Bullet(x + width / 2, y);
    }
}
