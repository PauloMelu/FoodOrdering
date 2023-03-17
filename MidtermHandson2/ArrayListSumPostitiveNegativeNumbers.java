import java.util.*;
public class ArrayListSumPostitiveNegativeNumbers{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int pos=0,neg=0,even=0,odd=0;

        System.out.println("Enter the 10 values of the ArrayList");
        for(int i=0;i<10;i++){
            arr.add(in.nextInt());
            if(arr.get(i)>0)
                pos+= arr.get(i);
            else if(arr.get(i)<0)
                neg += arr.get(i);
            
            if(arr.get(i)%2==0)
                even += arr.get(i);
            else
                odd += arr.get(i);
        }
        System.out.println("The sum of even numbers is: " + even);
        System.out.println("The sum of odd numbers is: " + odd);
        System.out.println("The sum of positive numbers is: " + pos);
        System.out.println("The sum of negative numbers is: " + neg);
    }
}