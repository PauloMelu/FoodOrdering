import java.util.*;
class CompareWithStack{
    static int equal = 0, greater = 0, smaller = 0;
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = in.nextInt();
        
        System.out.print("Enter the size of the stack: ");
        int size = in.nextInt();
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter the elements of the stack:");
        for(int i=0;i<size;i++){
            stack.add(in.nextInt());
        }
        System.out.println("Inputted stack elements: " + stack);
        counter(stack, num);
        System.out.println("Number/s equal to the inputted value from the stack: " + equal + "\nNumber/s greater than the inputted value from the stack: " + greater +"\nNumber/s smaller than the inputted value from the stack: " + smaller);
    }

    static void counter(Stack<Integer> stack, int num){
        for(int elem:stack){
            if(elem>num)
                greater++;
            else if(elem<num)
                smaller++;
            else
                equal++;
        }
    }
}