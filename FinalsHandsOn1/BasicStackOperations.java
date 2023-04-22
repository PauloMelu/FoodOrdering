import java.util.*;
class BasicStackOperations{
    public static void main(String[]args){
        Random rn = new Random();
        
        int stack_size = rn.nextInt(19)+1;
        //System.out.println(stack_size);
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<stack_size;i++)
            stack.push(rn.nextInt(100));
        System.out.println("Original stack elements: " + stack);
        int popCount = rn.nextInt(stack_size - 1) + 1;
        for(int i=0;i<popCount;i++)
            stack.pop();
        System.out.println(popCount + " pop functions are executed");
        System.out.println("Stack after pop operations: " + stack);
        System.out.println("The top element is: " + stack.peek());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}