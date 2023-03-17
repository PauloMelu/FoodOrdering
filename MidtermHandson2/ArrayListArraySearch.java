import java.util.*;
public class ArrayListArraySearch{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int pos=0,neg=0,zero=0,even=0,odd=0;
        System.out.println("Enter values of the Array List");
        for(int i=0;i<10;i++){
            arr.add(in.nextInt());
            if(arr.get(i)>0)
                pos++;
            else if(arr.get(i)<0)
                neg++;
            else
                zero++;
            if(arr.get(i)%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of 0s: " + zero);
    }
}