import java.util.*;
public class ArrayListGrades{
    public static void main(String[]args){
        int sum=0;
        ArrayList<Integer> arr = new ArrayList<Integer>(10){
            {
                add(86);add(90);add(90);add(86);add(88);
                add(84);add(92);add(88);add(88);add(88);
            }
        };
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++)
            sum += arr.get(i);
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + sum/arr.size());
        System.out.println("The highest value is: " + arr.get(arr.size()-1));
        System.out.println("The lowest value is: " + arr.get(0));
    }
}