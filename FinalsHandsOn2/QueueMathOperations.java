import java.util.*;
class QueueMathOperations{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Queue<Integer> list = new LinkedList<Integer>();
        System.out.println("Enter the queue integer elements:");
        int sum = 0;
        int max = 0, min = 0;
        for(int i=0;i<10;i++){
            int num = in.nextInt();
            list.add(num);
            sum += num;
            max = min = list.peek();
        }
        System.out.println("Inputted queue elements: " + list);
        System.out.println("The sum is: " + sum);
        float sumFloat = sum;
        System.out.println("The average is: " + sumFloat/10);
        for(int num:list){
            if(num>max) max = num;
            if(num<min) min = num;
        }
        System.out.println("The highest value is: " + max);
        System.out.println("The lowest value is: " + min);
    }
}