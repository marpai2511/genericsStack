/**
 *This is the StackEmptyException
 * @author Mario Paia
 * @version 2024-02-14
 */
public class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }

    public StackEmptyException() {
        super("Stack is empty!");
    }
}