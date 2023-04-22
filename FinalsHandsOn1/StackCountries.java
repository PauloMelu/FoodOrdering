import java.util.*;
class StackCountries{
    static String countries[] = {"South Korea", "USA", "Mauritius", "Japan", "China", "Taiwan", "Canada", "UK", "Thailand", "Germany"};
    public static void main(String[]args){
        Stack<String> stack = new Stack<String>();
        for(int i=0;i<countries.length;i++)
            stack.push(countries[i]);
        System.out.println("Stack elements are:");
        System.out.println(stack);
        System.out.println("Topmost element is: " + stack.peek());
        for(int i=0;i<5;i++)
            stack.pop();
        System.out.println("Updated stack elements: " + stack);
    }
}