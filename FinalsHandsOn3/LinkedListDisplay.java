import java.util.*;
class LinkedListDisplay{

    static int max, min;
    static int neg;
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the size of the LinkedList: ");
        int size = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter the elements of the LinkedList:");
        for(int i=0;i<size;i++){
            list.add(in.nextInt());
        }
        System.out.println("Inputted LinkedList elements: " + list);
        counter(list, list.peek());
        System.out.println("The smallest value: " + min + "\nThe biggest value: " + max + "\nNumber of negative numbers: " + neg);
        displayEvenOddNeg(list, list.peek());
    }

    static void counter(LinkedList<Integer> list, int num){
        max = min = num;
        for(int elem:list){
            if(elem > max)
                max = elem;
            else if(elem < min)
                min = elem;
            if(elem<0)
                neg++;
        }
    }

    static void displayEvenOddNeg(LinkedList<Integer> list, int num){
        LinkedList<Integer> even = new LinkedList<>();
        LinkedList<Integer> odd = new LinkedList<>();
        LinkedList<Integer> negs = new LinkedList<>();
        LinkedList<Integer> numsgreater = new LinkedList<>();
        for(int elem:list){
            if(elem % 2 == 0)
                even.add(elem);
            else
                odd.add(elem);
            if(elem < 0)
                negs.add(elem);
            if(elem > num)
                numsgreater.add(elem);
        }
        System.out.print("Even numbers are: ");
        for(int elem:even)
            System.out.print(elem + ", ");
        System.out.println();
        System.out.print("Odd numbers are: ");
        for(int elem:odd)
            System.out.print(elem + ", ");
        System.out.println();
        System.out.print("Negative numbers are: ");
        for(int elem:negs)
            System.out.print(elem + ", ");
        System.out.println();
        System.out.print("Numbers greater than " + num + " are ");
        for(int elem:numsgreater)
            System.out.print(elem + ", ");
        System.out.println();
        
    }



}