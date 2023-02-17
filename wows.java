import java.io.*;
import java.util.*;

public class wows{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Enter the length of the array: ");
        num = input.nextInt();

        int[] numarr = new int[num];
        int max=0,min=0;
        System.out.println("Enter the " + num + " elements of the array:");
        for(int i=0;i<num;i++){
            numarr[i] = input.nextInt();
            if(i==0){
                max = numarr[i];
                min = numarr[i];
            }else{
                if(numarr[i]>max)
                    max = numarr[i];
                if(numarr[i]<min)
                    min = numarr[i];
            }
        }

        int mindiff=max-min,min1=0,min2=0;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i==j){
                    continue;
                }
                if(numarr[i]>numarr[j]){
                    if(numarr[i]-numarr[j]<mindiff){
                        min1 = i;
                        min2 = j;
                        mindiff = numarr[i]-numarr[j];
                    }
                }
            }
        }

        System.out.println("Maximum difference: " + max + "-" + min + " = " + (max-min));
        System.out.println("Minimum difference: " + numarr[min1] + "-" + numarr[min2] + " = " + mindiff);
    }
}