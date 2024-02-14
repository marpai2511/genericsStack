public class Stack <T> {
    private T[] stack;

    public Stack() {
        this.stack = (T[]) new Object[10];
    }

    public Stack(int size) {
        this.stack = (T[]) new Object[size];
    }

    public boolean push(T item) {
        for(int i = 0; i < stack.length; i++) {
            if(this.stack[i] == null) {
                this.stack[i] = item;
                return true;
            }
        }
    }
}
