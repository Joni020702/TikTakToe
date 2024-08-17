package TikTakToe.model;

public interface Board {
    int SIZE = 3;

    /**
     * GetGet the player who should start or already started the game.
     * As an invariant, this player is CROSS.
     *
     * @return the player who makes the initial move.
     */
    Player getOpeningPlayer();

    /**
     * Gets whether the player is CROSS or CIRCLE.
     *
     * @return the symbol of the human.
     */
    SlotState getHumanSign();

    /**
     * Gets the player who is allowed to execute the next move.
     *
     * @return The player who shall make the next move.
     * @throws IllegalStateException If the game is already over.
     */
    Player getNextPlayer();

    /**
     * Checks if the provided coordinates are valid slots within the game.
     *
     * @param row of the board.
     * @param col of the board.
     * @return {@code true} if and only if valid coordinates.
     */
    boolean isValidPosition(int row, int col);

    /**
     * Executes a human move. This method does not change the state
     * of this instance, which is treated here as immutable. Instead,
     * a new board/game is returned, which is a copy of {@code this}
     * with the move executed.
     *
     * @param row of the move.
     * @param col of the move.
     * @return A new board with the move executed. If the move is not valid,
     * then {@code null} will be returned.
     * @throws IllegalStateException If the game is already over, or it is not
     *         the human's turn.
     * @throws IllegalArgumentException If the provided parameters are invalid,
     *         e.g., the slot lies outside the grid.
     */
    Board move(int row, int col);

    /**
     * Executes a human move. This method does not change the state
     * of this instance, which is treated here as immutable. Instead,
     * a new board/game is returned, which is a copy of {@code this}
     * with the move executed.
     *
     * @return A new board with the move executed.
     * @throws IllegalStateException If the game is already over, or it is not
     *         the machine's turn.
     */
    Board machineMove();

    /**
     * Sets the skill level of the machine.
     *
     * @param level The skill as a number, must be at least 1.
     */
    void setLevel(int level);

    /**
     * Checks if the game is over, i.e., one player has won, or they drew.
     *
     * @return {@code true} if and only if the game is over.
     */
    boolean isGameOver();

    /**
     * Checks if the game state is won or a draw.
     * Only valid if the game is already over.
     *
     * @return The winner or {@code GameState.DRAW}.
     * @throws IllegalStateException If the game is not over yet, then there is
     *         no winner.
     */
    Player getWinner();

    /**
     * Get the state of slot.
     *
     * @param row of the slot.
     * @param diag of the slot.
     * @return the state of the slot.
     */
    SlotState getSlot(int row, int diag);

    /**
     * Get the String representation of this board.
     *
     * @return the String representation of the board.
     */
    @Override
    public String toString();
}
