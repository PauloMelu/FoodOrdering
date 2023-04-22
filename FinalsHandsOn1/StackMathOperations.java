import java.util.*;
class StackMathOperations{
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Enter the stack integer elements:");
        int sum=0;
        int max=0;
        int min=0;
        for(int i=0;i<10;i++){
            stack.push(in.nextInt());
            sum += stack.peek();
            if(i==0)
                max = min = stack.peek();
            if(stack.peek()>max)
                max = stack.peek();
            else if(stack.peek()<min)
                min = stack.peek();
        }
        System.out.println("Inputted stack elements: " + stack);
        System.out.println("The sum is: " + sum);
        double sumDouble = sum;
        System.out.println("The average is: " + sumDouble/10);
        System.out.println("The highest value is: " + max);
        System.out.println("The lowest value is: " + min);
    }
}