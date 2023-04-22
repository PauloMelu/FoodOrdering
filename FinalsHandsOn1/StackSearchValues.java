import java.util.*;
class StackSearchValues{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Enter values of the stack:");
        int pos=0, neg=0, odd=0, even=0, zero=0;
        for(int i=0;i<10;i++){
            stack.push(in.nextInt());
            if(stack.peek()>0)
                pos++;
            else if(stack.peek()<0)
                neg++;
            else
                zero++;
            if(stack.peek()%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Inputted stack elements: " + stack);
        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of 0s: " + zero);
    }
}