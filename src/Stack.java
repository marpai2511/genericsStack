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

    public T pop() {
        T[] newStack = this.stack.clone();
        for(int i = this.stack.length - 1; i >= 0; i--) {
            if(this.stack[i] != null) {
                this.stack[i] = null;
                return newStack[i];
            }
        }
    }

    public T peek() {
        for(int i = this.stack.length - 1; i >= 0; i--) {
            if(this.stack[i] != null) {
                return this.stack[i];
            }
        }
    }
}
