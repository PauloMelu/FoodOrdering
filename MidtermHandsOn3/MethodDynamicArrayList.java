import java.util.*;
class MethodDynamicArrayList{
    static Scanner in = new Scanner(System.in);
    static String[] operations = {
        "A - Adding element to List / Add element",
        "C - Changing elements / Set element",
        "R - Removing elements / Delete element",
        "I - Iterating elements",
        "G - Get elements",
        "E - Add elements in between two numbers",
        "S - Sorting elements",
        "Z - ArrayList size"
    };
    public static void main(String[]args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr = getInput(arr);
        String choice = getChoice();
        executeChoice(choice, arr);
    }

    public static ArrayList<Integer> getInput(ArrayList<Integer> arr){
        System.out.print("What is the size of the ArrayList? ");
        int num = in.nextInt();
        System.out.println("Enter the values:");
        for(int i=0;i<num;i++)
            arr.add(in.nextInt());
        return arr;
    }

    public static String getChoice(){
        System.out.println("Press the letter for specific operation.");
        for(String elem:operations)
            System.out.println(elem);
        System.out.print("Type your option: ");
        String catchTrailingNewLine = in.nextLine();
        return in.nextLine();
    }

    public static void executeChoice(String choice, ArrayList<Integer> arr){
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