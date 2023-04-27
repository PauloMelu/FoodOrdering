import java.util.*;
class QueueCountries{
    public static void main(String[]args){
        String[] countries = new String[]{"South Korea", "USA", "Mauritius", "Japan", "China", "Taiwan", "Canada", "UK", "Thailand", "Germany"};
        Queue<String> list = new LinkedList<String>();
        for(int i=0;i<countries.length;i++) list.add(countries[i]);
        System.out.println("Queue elements are: " + list);
        System.out.println("Topmost element is: " + list.peek());
        for(int i=0;i<5;i++) list.remove();
        System.out.println("Updated queue elements: " + list);
    }
}