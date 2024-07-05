package Assignment;

/**
 * Creates instances of game objects using the Factory pattern.
 */
public class GameObjectFactory {
    /**
     * Creates a new player spaceship.
     *
     * @param x Initial x-coordinate.
     * @param y Initial y-coordinate.
     * @param lives Initial lives of 3.
     * @return A new PlayerSpaceship instance.
     */
    public static PlayerSpaceship createPlayerSpaceship(int x, int y, int lives) {
        return new PlayerSpaceship(x, y, lives);
    }

    /**
     * Creates a new alien.
     *
     * @param x Initial x-coordinate.
     * @param y Initial y-coordinate.
     * @return A new Alien instance.
     */
    public static Alien createAlien(int x, int y, int width, int height, int velocityX, int velocityY,
    int deltaX, int minX, int maxX, int minY, int maxY) {
        return new Alien(x, y, width, height, velocityX, velocityY, deltaX, minX, maxX, minY, maxY);
    }

    /**
     * Creates a new bullet.
     *
     * @param x Initial x-coordinate.
     * @param y Initial y-coordinate.
     * @return A new Bullet instance.
     */
    public static Bullet createBullet(int x, int y) {
        return new Bullet(x, y);
    }
}
