import java.util.*;
class CompareTwoQueues{
    
    static  Scanner in = new Scanner(System.in);
    public static void main(String[]args){

        System.out.print("Enter the size of your first queue: ");
        int size1 = in.nextInt();
        Queue<Integer> first = new LinkedList<>();
        first = getInput(first, size1);
        System.out.println("The elements of the first queue are: " + first);

        System.out.print("Enter the size of your second queue: ");
        int size2 = in.nextInt();
        Queue<Integer> scnd = new LinkedList<>();
        scnd = getInput(scnd, size2);
        System.out.println("The elements of the second queue are: " + scnd);

        int max1 = getBiggest(first, first.peek()), max2 = getBiggest(scnd, scnd.peek());
        int min1 = getSmallest(first, first.peek()), min2 = getSmallest(scnd, scnd.peek());
        if(max1>max2)
            System.out.println("Queue 1 has the biggest value: " + max1);
        else
            System.out.println("Queue 2 has the biggest value: " + max2);
        if(min1<min2)
            System.out.println("Queue 1 has the smallest value: " + min1);
        else
            System.out.println("Queue 2 has the smallest value: " + min2);

    }

    static Queue<Integer> getInput(Queue<Integer> queue, int size){
        System.out.println("Enter the elements of the queue:");
        for(int i=0;i<size;i++)
            queue.add(in.nextInt());
        return queue;
    }

    static int getBiggest(Queue<Integer> queue, int n){
        for(int num:queue)
            if(num>n)
                n = num;
        return n;
    }

    static int getSmallest(Queue<Integer> queue, int n){
        for(int num:queue)
            if(num<n)
                n = num;
        return n;
    }
}