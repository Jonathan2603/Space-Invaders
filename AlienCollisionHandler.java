package Assignment;

import java.util.List;

/**
 * Handles collisions between the player spaceship and aliens.
 */
public class AlienCollisionHandler extends CollisionHandler {
    private List<Alien> aliens;

    /**
     * Constructor.
     *
     * @param aliens The list of aliens to handle collisions with.
     */
    public AlienCollisionHandler(List<Alien> aliens) {
        this.aliens = aliens;
    }

    /**
     * Handles specific collision actions between the player spaceship and aliens.
     *
     * @param element1 The first element.
     * @param element2 The second element.
     */
    @Override
    protected void handleCollisionAction(Element element1, Element element2) {
        if (element1 instanceof PlayerSpaceship && element2 instanceof Alien) {
            // Handle specific actions for the collision
            PlayerSpaceship playerSpaceship = (PlayerSpaceship) element1;
            int playerLives = playerSpaceship.getLives();

            // Perform additional actions using playerSpaceship...
            System.out.println("Player Lives: " + playerLives);

            // Example: Decrease player lives
            PlayerLives.getInstance().decreaseLives();

            // Example: Remove the alien from the list
            aliens.remove((Alien) element2);
        } else if (element1 instanceof Bullet && element2 instanceof Alien) {
            // Handle specific actions for the collision
            Bullet bullet = (Bullet) element1;

            // Example: Increase the score by 30
            Score.getInstance().incrementScore(30);

            // Example: Remove the alien from the list
            aliens.remove((Alien) element2);
        }
    }
}