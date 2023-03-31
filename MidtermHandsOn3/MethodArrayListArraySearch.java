import java.util.*;
class MethodArrayListArraySearch{
    static int pos = 0, neg = 0, odd = 0, even = 0, zeros = 0;
    static Scanner in = new Scanner(System.in);
    public static void main (String[]args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr = getTen(arr);
        getCounts(arr);
    }

    public static ArrayList<Integer> getTen (ArrayList<Integer> arr){
        System.out.println("Enter values of the Array List");
        for(int i=0;i<10;i++)
            arr.add(in.nextInt());
        return arr;
    }

    public static void getCounts(ArrayList<Integer> arr){
        pos = neg = odd = even = zeros = 0;
        for(int elem:arr){
            if(elem>0)
                pos++;
            else if(elem<0)
                neg++;
            else
                zeros++;
            if(elem%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of 0s: " + zeros);
    }
}