package TikTakToe.model;

public class BoardField implements Cloneable {
    private SlotState slotState;
    private int row;
    private int col;

    /**
     * Constructor to create a field on the board.
     * @param slotState the initial state
     * @param row of the slot
     * @param col of the slot
     */
    public BoardField(SlotState slotState, int row, int col){
        //TODO
    }

    //TODO Getter and Setter methods for BoardField

    /**
     * Convert the slot to a String representation.
     *
     * @return the String representation of the slot.
     */
    @Override
    public String toString(){
        //TODO
        return null;
    }

    /**
     * Deep copy the field.
     *
     * @return a deep copy of the field.
     * @throws CloneNotSupportedException When type does not support a clone.
     */
    @Override
    public BoardField clone() throws CloneNotSupportedException {
        // TODO
        return null;
    }
}
