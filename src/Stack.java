public class Stack <T> {
    private T[] stack;

    /**
     * This is the default constructor for the Stack class, the default value is 10.
     */
    public Stack()  {
        this.stack = (T[]) new Object[10];
    }

    /**
     * This is the second constructor for the Stack class, its value can be set by the parameter
     *@param size the length of the array
     */
    public Stack(int size)  {
        this.stack = (T[]) new Object[size];
    }

    /**
     * This method adds an item in the stack, it uses a "on top of eachother" system.
     * @param item the item to be added
     * @return whether the implementation was successful or not
     * @throws StackFullException if the stack had no more space for new objects
     */
    public boolean push(T item) throws StackFullException  {
        for(int i = 0; i < stack.length; i++)   {
            if(this.stack[i] == null)   {
                this.stack[i] = item;
                return true;
            }
        }
        throw new StackFullException();
    }

    /**
     * This method removes the top object of the stack while also returning its value
     * @return the object
     * @throws StackEmptyException there was no object to be returned and removed
     */
    public T pop() throws  StackEmptyException {
        T[] newStack = this.stack.clone();
        for(int i = this.stack.length - 1; i >= 0; i--)  {
            if(this.stack[i] != null)   {
                this.stack[i] = null;
                return newStack[i];
            }
        }
        throw new StackEmptyException();
    }

    /**
     * This method is identical to the pop method but it does not remove any objects
     * @return the object
     * @throws StackEmptyException there was no object
     */
    public T peek() throws StackEmptyException {
        for(int i = this.stack.length - 1; i >= 0; i--)  {
            if(this.stack[i] != null)   {
                return this.stack[i];
            }
        }
        throw new StackEmptyException();
    }

    /**
     * This method simply lists all of the objects
     * @return the list
     * @throws StackEmptyException stack is empty
     */
    public String list() throws StackEmptyException {
        String text = "";
        for(int i = 0; i < this.stack.length; i++)  {
            if(this.stack[i] != null)   {
                text += this.stack[i];
                text += "; ";
            }
        }
        if(text.equals("")) {
            throw new StackEmptyException();
        }
        return text;
    }
}