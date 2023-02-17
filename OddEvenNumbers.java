import java.io.*;

public class OddEvenNumbers{
    public static void main(String [] args){
        
        int sum=0;
        System.out.println("The first 15 even numbers are:");
        for(int i=1;i<=30;i++){
            if(i%2==0)
                System.out.println(i);
            else
                sum += i;
        }
        System.out.println("The sum of the first 15 odd numbers is: " + sum);
    }
}