import java.util.*;
class DynamicStackOperations{
    static Scanner in = new Scanner(System.in);
    public static void main(String[]args){
        Stack<Integer> stack = new Stack<Integer>();
        System.out.print("What is the size of the stack? ");
        int size = in.nextInt();
        System.out.println("Enter the values of the stack:");
        for(int i=0;i<size;i++)
            stack.push(in.nextInt());
        System.out.print("Type your option: ");
        in.nextLine();
        String choice = in.nextLine();
        operations(choice, stack);
    }

    static void operations(String choice, Stack<Integer> stack){
        switch(choice){
            case "A":
                System.out.println("You want to add a new element.");
                System.out.print("Enter the element you want to add: ");
                stack.push(in.nextInt());
                System.out.println("The stack elements now are:");
                System.out.println(stack);
                break;
            case "C":
                System.out.println("You want to change new element.");
                System.out.print("Enter the index of the element you want to change: ");
                int index = in.nextInt();
                System.out.print("Enter the new value: ");
                int value = in.nextInt();
                stack.set(index, value);
                System.out.println("The stack elements now are:");
                System.out.println(stack);
                break;
            case "R":
                System.out.println("You will remove or delete the element.");
                System.out.print("Enter the index of the element you want to delete: ");
                stack.remove(in.nextInt());
                System.out.println("The stack elements now are:");
                System.out.println(stack);
                break;
            case "I":
                System.out.println("You want to iterate the stack elements.");
                System.out.println("The stack elements are:");
                for(int i=0;i<stack.size();i++)
                    System.out.print(stack.get(i) + " ");
                break;
            case "G":
                System.out.println("You want to get the stack elements.");
                System.out.println("The stack elements are:");
                for(int i=0;i<stack.size();i++)
                    System.out.print(stack.get(i) + " ");
                break;
            case "S":
                System.out.println("You want to sort the stack elements.");
                System.out.print("The original arrangements: " + stack + "\n");
                Collections.sort(stack);
                System.out.print("Sorted stack elements: " + stack + "\n");
                break;
            case "Z":
                System.out.println("You want to know the size of the Stack");
                System.out.println("The stack size is: " + stack.size());
                break;
            case "T":
                System.out.println("You want to get the top element of the stack");
                System.out.println("The top element of the stack is: " + stack.peek());
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}