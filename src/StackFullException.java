/**
 *This is the StackFullException
 * @author Mario Paia
 * @version 2024-02-14
 */
public class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }

    public StackFullException() {
        super("Stack is full!");
    }
}