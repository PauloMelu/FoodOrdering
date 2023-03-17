import java.util.*;
public class ArrayListBiggestSmallest{
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int max=0,min=0;
        System.out.println("Enter the 15 values of the ArrayList");
        for(int i=0;i<15;i++){
            arr.add(in.nextInt());
            if(i == 0)
                max = min = arr.get(i);
            else if(arr.get(i)>max)
                max = arr.get(i);
            else if(arr.get(i)<min)
                min = arr.get(i);
        }
        System.out.println("The highest value is: " + max);
        System.out.println("The smallest value is: " + min);
    }
}