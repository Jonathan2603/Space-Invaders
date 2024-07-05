package Assignment;

/**
 * Represents a basic element in the game.
 */
public class Element {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected int velocityX;
    protected int velocityY;

    /**
     * Constructor to initialize the element.
     *
     * @param x          The initial x position.
     * @param y          The initial y position.
     * @param width      The width of the element.
     * @param height     The height of the element.
     * @param velocityX  The horizontal velocity of the element.
     * @param velocityY  The vertical velocity of the element.
     */
    public Element(int x, int y, int width, int height, int velocityX, int velocityY) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    /**
     * Checks if this element collides with another element.
     *
     * @param other The other element to check for collision.
     * @return True if a collision occurs, false otherwise.
     */
    public boolean checkCollision(Element other) {
        // Implement collision detection logic based on the bounding boxes
        return x < other.x + other.width &&
               x + width > other.x &&
               y < other.y + other.height &&
               y + height > other.y;
    }

    // Add other methods and properties as needed...
}
