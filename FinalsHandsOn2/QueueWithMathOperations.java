import java.util.*;
class QueueWithMathOperations{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Queue<Integer> list = new LinkedList<Integer>();
        System.out.print("Enter the length of the queue: "); int size = in.nextInt();
        System.out.println(size + " elements of the queue are:");

        int sum = 0, oddSum = 0;
        for(int i=0;i<size;i++){
            int num = in.nextInt();
            list.add(num);
            sum += num;
            if(num%2!=0) oddSum += num;
        }
        System.out.println("The sum of odd numbers is: " + oddSum);
        System.out.println("The sum of all inputted numbers is: " + sum);
    }
}