import java.io.*;
import java.util.*;

public class LargestQuotient{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers separated by a space.");
        System.out.print("Ends with 0: ");
        int[] numbers = new int[15];
        for(int i=0;i<15;i++){
            numbers[i] = input.nextInt();
            if(numbers[i]==0)
                break;
        }
        int maxdif=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(numbers[j]!=0)
                    if(numbers[i]/numbers[j]>maxdif)
                        maxdif = numbers[i]/numbers[j];
            }
        }
        System.out.println(maxdif);
    }
}