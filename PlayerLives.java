package Assignment;

/**
 * Represents the player's lives using the Singleton pattern.
 */
public class PlayerLives {
    private static PlayerLives instance;
    private int lives;

    /**
     * Private constructor to enforce singleton pattern.
     */
    private PlayerLives() {
        this.lives = 3; // Starting with 3 lives, adjust as needed
    }

    /**
     * Gets the instance of the PlayerLives class.
     *
     * @return The PlayerLives instance.
     */
    public static PlayerLives getInstance() {
        if (instance == null) {
            instance = new PlayerLives();
        }
        return instance;
    }

    /**
     * Gets the current number of player lives.
     *
     * @return The current number of lives.
     */
    public int getLives() {
        return lives;
    }

    /**
     * Decreases the player's lives when hit.
     */
    public void decreaseLives() {
        lives--;
        // Add additional logic if needed (e.g., game over condition)
    }
}
