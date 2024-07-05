package Assignment;

/**
 * Handles collisions between game elements using the Chain of Responsibility pattern.
 */
public abstract class CollisionHandler {
    protected CollisionHandler nextHandler;

    /**
     * Sets the next handler in the chain.
     *
     * @param nextHandler The next handler in the chain.
     * @return The next handler.
     */
    public CollisionHandler setNextHandler(CollisionHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    /**
     * Handles collisions between two elements.
     *
     * @param element1 The first element.
     * @param element2 The second element.
     */
    public void handleCollision(Element element1, Element element2) {
        if (element1.checkCollision(element2)) {
            handleCollisionAction(element1, element2);
        } else if (nextHandler != null) {
            nextHandler.handleCollision(element1, element2);
        }
    }

    /**
     * Placeholder method for handling specific collision actions.
     *
     * @param element1 The first element.
     * @param element2 The second element.
     */
    protected abstract void handleCollisionAction(Element element1, Element element2);
}
