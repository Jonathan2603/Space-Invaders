package Assignment;

/**
 * Represents a bullet element, a subclass of Element.
 */
public class Bullet extends Element {
    /**
     * Constructor to initialize the bullet.
     *
     * @param x Initial x-coordinate.
     * @param y Initial y-coordinate.
     */
    public Bullet(int x, int y) {
        // Initialize the bullet with a specific width, height, and upward velocity
        super(x, y, 5, 10, 0, -5);
    }

    public void updatePosition() {
        // Update the position based on the velocity (e.g., in the game loop)
        x += velocityX;
        y += velocityY;
    }
}
