package Assignment;

/**
 * Represents the player's score.
 */
public class Score {
    private static final Score instance = new Score();
    private int score;

    private Score() {
        this.score = 0;
    }

    public static Score getInstance() {
        return instance;
    }

    /**
     * Increments the player's score by a specified amount.
     *
     * @param amount The amount to increment the score.
     */
    public void incrementScore(int amount) {
        score += amount;
    }

    /**
     * Gets the current player's score.
     *
     * @return The current player's score.
     */
    public int getScore() {
        return score;
    }
}
