import java.util.*;
public class ArrayListMethodCountries{
    public static void main(String[]args){
        ArrayList<String> arr = new ArrayList<String>();
        System.out.println("List of Countries");
        arr = addCountries(arr);
        displayArray(arr);
    }
    public static ArrayList<String> addCountries (ArrayList<String> array){
        array.add("Japan");
        array.add("US");
        array.add("Philippines");
        array.add("Kuwait");
        array.add("Oman");
        array.add("Singapore");
        array.add("Hong Kong");
        array.add("Malaysia");
        array.add("Great Britain");
        return array;
    }
    public static void displayArray (ArrayList<String> arr){
        for(String elem : arr)
            System.out.println(elem);
    }
}