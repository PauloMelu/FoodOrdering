import java.util.*;
class StackWithMathOperations{
    static String numbers[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.print("Enter the length of the stack: ");
        int len = in.nextInt();
        String equiv;
        try{
            equiv = numbers[len];
        }catch(Exception e){
            equiv = Integer.toString(len);
        }

        int sumTotal = 0, oddSum = 0;
        System.out.println(equiv + " elements of the stack are:");
        for(int i=0;i<len;i++){
            stack.push(in.nextInt());
            sumTotal += stack.peek();
            if(stack.peek()%2!=0)
                oddSum += stack.peek();
        }
        System.out.println("The sum of odd numbers is: " + oddSum);
        System.out.println("The sum of all inputted numbers is: " + sumTotal);
    }
}