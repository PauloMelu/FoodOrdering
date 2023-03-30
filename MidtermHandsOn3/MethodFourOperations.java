import java.util.*;
public class MethodFourOperations {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter num1 :");
        num1 = in.nextInt();
        System.out.println("Enter num2 :");
        num2 = in.nextInt();
        sumOfTwo(num1,num2);
        diffOfTwo(num1,num2);
        prodOfTwo(num1,num2);
        aveOfTwo(num1,num2);
    }

    public static void sumOfTwo (int a, int b){
        System.out.println("The sum is: " + (a+b));
    }
    public static void diffOfTwo (int a, int b){
        System.out.println("The difference is: " + (a-b));
    }
    public static void prodOfTwo (int a, int b){
        System.out.println("The product is: " + (a*b));
    }
    public static void aveOfTwo (int a, int b){
        System.out.println("The average is: " + (a+b)/2);
    }
}