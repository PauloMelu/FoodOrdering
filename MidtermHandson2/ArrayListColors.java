import java.util.*;
public class ArrayListColors{
    public static void main(String[]args){
        ArrayList<String> arr = new ArrayList<>(10);
        System.out.println("List of colors are:");
        arr.add("Red");
        arr.add("Green");
        arr.add("Blue");
        arr.add("Yellow");
        arr.add("Purple");
        arr.add("Brown");
        arr.add("Orange");
        arr.add("Black");
        arr.add("White");
        arr.add("Navy Blue");
        arr.add("Maroon");
        for(int i=0;i<arr.size();i++)
            System.out.println(arr.get(i));
    }
}