public class Stack <T> {
    private T[] stack;

    public Stack() {
        this.stack = (T[]) new Object[10];
    }

    public Stack(int size) {
        this.stack = (T[]) new Object[size];
    }


}
