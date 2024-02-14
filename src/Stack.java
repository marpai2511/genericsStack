public class Stack <T> {
    private T[] stack;

    public Stack() {
        this.stack = (T[]) new Object[10];
    }

    public Stack(int size) {
        this.stack = (T[]) new Object[size];
    }

    /**
     * This method adds an item in the stack, it uses a "on top of eachother" system.
     * @param item the item to be added
     * @return whether the implementation was successful or not
     */
    public boolean push(T item) {
        for(int i = 0; i < stack.length; i++) {
            if(this.stack[i] == null) {
                this.stack[i] = item;
                return true;
            }
        }
    }


    /**0
     * This method removes the top object of the stack while also returning its value
     * @return the object
     */
    public T pop() {
        T[] newStack = this.stack.clone();
        for(int i = this.stack.length - 1; i >= 0; i--) {
            if(this.stack[i] != null) {
                this.stack[i] = null;
                return newStack[i];
            }
        }
    }

    /**
     * This method is identical to the pop method but it does not remove any objects
     * @return the object
     */
    public T peek() {
        for(int i = this.stack.length - 1; i >= 0; i--) {
            if(this.stack[i] != null) {
                return this.stack[i];
            }
        }
    }

    /**
     * This method simply lists all of the objects
     * @return the list
     */
    public String list() {
        String text = "";
        for (int i = 0; i < this.stack.length; i++) {
            if (this.stack[i] != null) {
                text += this.stack[i];
                text += "; ";
            }
        }
        return text;
    }
}
