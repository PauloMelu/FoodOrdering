import java.util.*;
class ArrayMethodSumPositiveNegativeNumbers{
    static Scanner in = new Scanner(System.in);
    static int totalSum = 0;

    public static void main(String[]args){
        int[][] arr = new int[2][5];
        arr = getValues(arr);
        int evenSum = sumOfEven(arr);
        System.out.println("The sum of even numbers is: " + evenSum);
        System.out.println("The sum of odd numbers is: " + (totalSum - evenSum));
        int posSum = sumOfPos(arr);
        System.out.println("The sum of positive numbers is: " + posSum);
        System.out.println("The sum of negative numbers is: " + (totalSum - posSum));
    }

    public static int[][] getValues (int[][] arr){
        System.out.println("Enter the 10 values of the array");
        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
                arr[i][j] = in.nextInt();
        return arr;
    }
    public static int sumOfEven(int[][] arr){
        int sum=0;
        for(int[] ar:arr)
            for(int elem:ar){
                totalSum += elem;
                if(elem % 2==0)
                    sum += elem;
            }
        return sum;
    }
    public static int sumOfPos(int[][] arr){
        int sum=0;
        for(int[] ar:arr)
            for(int elem:ar){
                if(elem > 0)
                    sum += elem;
            }
        return sum;
    }
}