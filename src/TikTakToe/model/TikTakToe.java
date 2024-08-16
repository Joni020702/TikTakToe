package TikTakToe.model;

public class TikTakToe implements Board {
    //TODO all attributes

    //TODO Constructor (public) to create a new TikTakToe game.

    //TODO Constructor (private) to copy a board.

    //TODO all implemented methods.
    /**
     * {@inheritDoc}
     */
    @Override
    public Player getOpeningPlayer() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlotState getHumanSign() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Player getNextPlayer() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isValidPosition(int row, int col) {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Board move(int row, int col) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Board machineMove() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setLevel(int level) {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isGameOver() {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Player getWinner() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SlotState getSlot(int row, int diag) {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return null;
    }
}
