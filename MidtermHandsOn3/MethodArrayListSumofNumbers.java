import java.util.*;
class MethodArrayListArraySearch{
    static Scanner in = new Scanner(System.in);
    static int oddSum=0, totalSum=0;
    public static void main (String[]args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr = getInput(arr);
        sumOfOddAndAll(arr);
    }

    public static ArrayList<Integer> getInput (ArrayList<Integer> arr){
        System.out.print("Enter the length of the Array List: ");
        int num = in.nextInt();
        for(int i=0;i<num;i++){
            System.out.printf("The value of an ArrayList at index %d: ",i);
            arr.add(in.nextInt());
        }
        return arr;
    }
    public static void sumOfOddAndAll (ArrayList<Integer> arr){
        oddSum = totalSum = 0;
        for(int elem:arr){
            totalSum += elem;
            if(elem%2 != 0)
                oddSum += elem;
        }
        System.out.println("The sum of odd numbers is: " + oddSum);
        System.out.println("The sum of all inputted numbers is: " + totalSum);
    }
}