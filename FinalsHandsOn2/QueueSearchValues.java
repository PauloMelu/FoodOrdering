import java.util.*;
class QueueSearchValues{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Queue<Integer> list = new LinkedList<Integer>();
        System.out.println("Enter the queue integer elements:");
        int neg = 0, pos = 0, zero = 0, even = 0, odd = 0;
        for(int i=0;i<10;i++){
            int num = in.nextInt();
            list.add(num);
            if(num>0) pos++;
            else if(num<0) neg++;
            else zero++;
            if(num%2!=0) odd++;
            else even++;
        }
        System.out.println("Inputted queue elements: " + list);
        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of 0s: " + zero);
    }
}