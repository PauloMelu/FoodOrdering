import java.util.*;
public class DynamicArrayList{
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("What is the size of the ArrayList? ");
        int num = in.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("Enter the values:");
        for(int i=0;i<num;i++)
            arr.add(in.nextInt());

        System.out.println("Press the letter for specific operation.");
        System.out.println("A - Adding element to List / Add element");
        System.out.println("C - Changing elements / Set element");
        System.out.println("R - Removing elements / Delete element");
        System.out.println("I - Iterating elements");
        System.out.println("G - Get elements");
        System.out.println("E - Add elements in between two numbers");
        System.out.println("S - Sorting elements");
        System.out.println("Z - ArrayList size");
        System.out.print("\nType your option: ");
        String catchTrailingNewLine = in.nextLine();
        String choice = in.nextLine();

        switch(choice){
            case "A":
                System.out.println("You want to add a new element.");
                System.out.print("Enter the element you want to add: ");
                arr.add(in.nextInt());
                System.out.println("The ArrayList elements now are:");
                System.out.println(arr);
                break;
            case "C":
                System.out.println("You want to change new element.");
                System.out.print("Enter the index of the element you want to change: ");
                int index = in.nextInt();
                System.out.print("Enter the new value: ");
                int value = in.nextInt();
                arr.set(index,value);
                System.out.println("The ArrayList elements now are:");
                System.out.println(arr);
                break;
            case "R":
                System.out.println("You will remove or delete the element.");
                System.out.print("Enter the index of the element you want to delete: ");
                arr.remove(in.nextInt());
                System.out.println("The ArrayList elements now are:");
                System.out.println(arr);
                break;
            case "I":
                System.out.println("You want to iterate the ArrayList elements.");
                System.out.println("The ArrayList elements are:");
                System.out.println(arr);
                break;
            case "G":
                System.out.println("You want to get the ArrayList elements.");
                System.out.println("The ArrayList elements are:");
                for(int i=0;i<arr.size();i++)
                    System.out.print(arr.get(i) + " ");
                break;
            case "E":
                System.out.println("You want to add elements in between two numbers.");
                System.out.print("Beggining index: ");
                int index1 = in.nextInt();
                System.out.print("Ending index: ");
                int index2 = in.nextInt();
                System.out.print("Enter the value of the element to be inserted: ");
                arr.add(index2,in.nextInt());
                System.out.println("The ArrayList elements are:");
                System.out.println(arr);
                break;
            case "S":
                System.out.println("You want to sort the elements of the Array List.");
                System.out.println("The original arrangements: " + arr);
                Collections.sort(arr);
                System.out.println("Sorted ArrayList: " + arr);
                break;
            case "Z":
                System.out.println("You want to know the size of the ArrayList.");
                System.out.println("The ArrayList size is: " + arr.size());
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}