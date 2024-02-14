public class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }

    public StackFullException() {
        super("Stack is full!");
    }
}