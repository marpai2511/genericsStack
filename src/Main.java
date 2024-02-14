/**
 *This is the main class
 * @author Mario Paia
 * @version 2024-02-14
 */
public class Main {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>(3);
        Stack<String> emptyStack = new Stack<>(3);

        //This is where the push method is tested
        try {
            stringStack.push("Mario Paia");
            stringStack.push("Jifan");
            stringStack.push("TGM");
        }
        catch(StackFullException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Pop method test:");
        //This is where I test the pop methods, one empty exception should be thrown
        try {
            System.out.println(stringStack.pop());
            System.out.println(stringStack.pop());
            System.out.println(emptyStack.pop());
        }
        catch(StackEmptyException e) {
            System.out.println(e.getMessage());
        }


        System.out.println();
        System.out.println("Integer stack test:");
        Stack<Integer> integerStack = new Stack<>(5);
        //Integer stack tested, there should be one full exception thrown

        try {
            integerStack.push(20);
            integerStack.push(30);
            integerStack.push(15);
            integerStack.push(50);
            integerStack.push(10);
            integerStack.push(50);
        }
        catch(StackFullException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("Peek method test:");
        //Peek methods tested, one thrown exception is the desired output.
        try {
            System.out.println(stringStack.peek());
            System.out.println(integerStack.peek());
            System.out.println(emptyStack.peek());
        }
        catch(StackEmptyException e)    {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("List method test:");
        //Lists all the stacks, there should be an empty stack exception thrown.
        try {
            System.out.println(integerStack.list());
            System.out.println(stringStack.list());
            System.out.println(emptyStack.list());
        }
        catch(StackEmptyException e)    {
            System.out.println(e.getMessage());
        }
    }
}
