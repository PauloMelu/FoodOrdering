import java.io.*;
import java.util.*;

public class FibonacciSequence{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter a number to create a Fibonacci sequence: ");
        num = input.nextInt();
        
        int num1=0,num2=1,num3;
        System.out.print("The Fibonacci sequence is: " + num1 + " " + num2);
        for(int i=0;i<num-2;i++){
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(" " + num3);
        }
        System.out.println("");
    }
}