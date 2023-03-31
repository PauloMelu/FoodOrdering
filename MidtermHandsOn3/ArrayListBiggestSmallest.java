import java.util.*;
class ArrayListBiggestSmallest{
    static Scanner in = new Scanner(System.in);
    static int max = 0;
    static int min = 0;
    public static void main (String[]args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr = addElem(arr);
        getMaxMin(arr);
        System.out.println("The highest value is: " + max);
        System.out.println("The smallest value is: " + min);
    }
    public static ArrayList<Integer> addElem(ArrayList<Integer> arr){
        System.out.println("Enter the values of the 1-D array:");
        for(int i=0;i<15;i++)
            arr.add(in.nextInt());
        max = min = arr.get(0);
        return arr;
    }
    public static void getMaxMin(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max)
                max = arr.get(i);
            else if(arr.get(i)<min)
                min = arr.get(i);
        }
    }
}