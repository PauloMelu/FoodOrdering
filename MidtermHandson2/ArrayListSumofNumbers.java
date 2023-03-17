import java.util.*;
public class ArrayListSumofNumbers{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int num,totalSum=0,oddSum=0;
        System.out.print("Enter the length of the ArrayList: ");
        num = in.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("The value of an ArrayList at index " + i + ": ");
            arr.add(in.nextInt());
            totalSum += arr.get(i);
            if(arr.get(i)%2!=0)
                oddSum += arr.get(i);
        }
        System.out.printf("\nThe sum of odd numbers is: %d",oddSum);
        System.out.printf("\nThe sum of all inputted numbers is: %d\n",totalSum);
    }
}