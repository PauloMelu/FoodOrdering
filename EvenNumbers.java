import java.io.*;
import java.util.*;

public class EvenNumbers{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        
        int breaker=0;
        int num;

        System.out.print("Enter a number: ");
        num = input.nextInt();
        
        System.out.println("The first " + num + " even numbers are:");
        for(int i=1;i>0;i++){
            if(i%2==0){
                System.out.println(i);
                breaker++;
            }
            if(breaker==num)
                break;
        }
    }
}