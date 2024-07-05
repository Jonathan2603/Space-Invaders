package Assignment;
/**
 * Represents an alien in the Space Invaders game.
 */
public class Alien extends Element {
    private int velocityX; // Horizontal velocity
    private int velocityY; // Vertical velocity (always downward)
    private int deltaX;     // Horizontal distance to move down when hitting boundaries

    // Define horizontal boundaries
    private int minX;
    private int maxX;

    // Define vertical boundaries
    private int minY;
    private int maxY;

    /**
     * Constructor to initialize the alien.
     *
     * @param x         The initial x position.
     * @param y         The initial y position.
     * @param width     The width of the alien.
     * @param height    The height of the alien.
     * @param velocityX The horizontal velocity of the alien.
     * @param velocityY The vertical velocity of the alien.
     * @param deltaX    The horizontal distance to move down when hitting boundaries.
     * @param minX      The left boundary for horizontal movement.
     * @param maxX      The right boundary for horizontal movement.
     * @param minY      The top boundary for vertical movement.
     * @param maxY      The bottom boundary for vertical movement.
     */
    public Alien(int x, int y, int width, int height, int velocityX, int velocityY,
                 int deltaX, int minX, int maxX, int minY, int maxY) {
        super(x, y, width, height, maxY, maxY);
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.deltaX = deltaX;
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
    }

    /**
     * Moves the alien in a predefined pattern.
     */
    public void move() {
        // Update the y position based on the vertical velocity
        y += velocityY;

        // Check if the alien has reached the horizontal boundaries
        if (x < minX) {
            // If reached the left boundary, change direction and move down
            x = minX;
            velocityX = -velocityX; // Change horizontal direction
            y += deltaX; // Move down
        } else if (x > maxX) {
            // If reached the right boundary, change direction and move down
            x = maxX;
            velocityX = -velocityX; // Change horizontal direction
            y += deltaX; // Move down
        }

        // Check if the alien has reached the vertical boundary
        if (y > maxY) {
            // If reached the bottom boundary, reset to the top and change direction
            y = minY;
            velocityY = -velocityY; // Change vertical direction
        }
    }

    /**
     * Handles the alien shooting bullets.
     *
     * @return A new Bullet object representing the shot bullet.
     */
    public Bullet shoot() {
        // Create and return a new Bullet object with appropriate initial position
        return new Bullet(x + width / 2, y + height);
    }
}
