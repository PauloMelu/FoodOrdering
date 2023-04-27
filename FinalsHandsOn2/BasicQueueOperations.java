import java.util.*;
class BasicQueueOperations{
    public static void main(String[]args){
        int[] arr = new int[]{67, 12, 3, 4, 5, 6, 7, 8, 67, 89};
        Queue<Integer> list = new LinkedList<Integer>();
        for(int i=0;i<arr.length;i++)
            list.add(arr[i]);
        System.out.println("Original queue elements: " + list);
        list.remove();
        list.remove();
        System.out.println("Queue after dequeue operations: " + list);
        System.out.println("The top element is: " + list.peek());
        System.out.println("Is queue empty? " + list.isEmpty());
    }
}