import java.io.*;

public class DivisibleSumAverage{
    public static void main (String [] args){

        System.out.println("The first 10 whole numbers divisible by 4 are:");
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.println(i*4);
            sum += i*4;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + sum/10);
    }
}