import java.io.*;
import java.util.*;

public class Factorial{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();

        System.out.print("The factorial value is: ");
        int ans=1;
        for(int i=num;i>0;i--){
            ans *= i;
            if(i==1)
                System.out.print(i + " = ");
            else
                System.out.print(i + " * ");
        }
        System.out.println(ans);
    }
}