import java.util.*;
class MethodArrayListGrades{
    static int max=0;
    static int min=0;
    public static void main(String[]args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("The Array List values are:");
        arr = addValues(arr);
        displayArray(arr);
        System.out.println("The sum is: " + getSum(arr));
        System.out.println("The average is: " + getSum(arr)/arr.size());
        System.out.println("The highest value is: " + max);
        System.out.println("The lowest value is: " + min);
    }
    public static ArrayList<Integer> addValues (ArrayList<Integer> arr){
        int[] grades = {86,90,90,86,88,84,92,88,88,88};
        max = min = grades[0];
        for(int i:grades){
            arr.add(i);
            if(i>max)
                max = i;
            else if(i<min)
                min = i;
        }
        return arr;
    }
    public static void displayArray (ArrayList<Integer> arr){
        for(int i:arr)
            System.out.println(i);
    }
    public static int getSum (ArrayList<Integer> arr){
        int sum=0;
        for(int i:arr)
            sum += i;
        return sum;
    }
}