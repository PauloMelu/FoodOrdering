import java.util.*;
class DynamicQueueOperations{
    static Scanner in = new Scanner(System.in);
    public static void main(String[]args){
        
        Queue<Integer> list = new LinkedList<Integer>();
        System.out.print("What is the size of the queue? "); int size = in.nextInt();
        System.out.println("Enter the values of the queue:");
        for(int i=0;i<size;i++) list.add(in.nextInt());
        in.nextLine();
        System.out.println("Press the letter for specific operation.\nA – Adding element to queue/ Add element\nC- Changing elements/ Set element of queue\nR- Removing elements/Delete element\nI- Iterating elements\nG- get elements\nS- Sorting elements\nZ -Queue size\nT – Top element");
        System.out.print("Type your option: ");  String choice = in.nextLine();
        operations(choice, list);
    }
    static void operations(String choice, Queue<Integer> list){
        switch(choice){
            case "A":
                System.out.println("You want to add a new element.");
                System.out.print("Enter the element you want to add: ");
                list.add(in.nextInt());
                System.out.println("The queue elements now are:");
                System.out.println(list);
                break;
            case "C":
                System.out.println("You want to change new element.");
                System.out.print("Enter the index of the element you want to change: ");
                int index = in.nextInt();
                System.out.print("Enter the new value: ");
                int value = in.nextInt();
                int i=0;
                ArrayList<Integer> arr = new ArrayList<Integer>();
                for(int num:list){
                    if(i!=index)
                        arr.add(num);
                    else
                        arr.add(value);
                    i++;
                }
                System.out.println("The queue elements now are:");
                System.out.println(arr);
                break;
            case "R":
                System.out.println("You will remove or delete the element.");
                System.out.print("Enter the index of the element you want to delete: ");
                index = in.nextInt();
                i=0;
                arr = new ArrayList<Integer>();
                for(int num:list){
                    if(i!=index)
                        arr.add(num);
                    i++;
                }
                System.out.println("The queue elements now are:");
                System.out.println(arr);
                break;
            case "I":
                System.out.println("You want to iterate the queue elements.");
                System.out.println("The queue elements are:");
                for(int elem:list)
                    System.out.print(elem + " ");
                break;
            case "G":
                System.out.println("You want to get the queue elements.");
                System.out.println("The queue elements are:");
                for(int elem:list)
                    System.out.print(elem + " ");
                break;
            case "S":
                System.out.println("You want to sort the queue elements.");
                System.out.print("The original arrangements: " + list + "\n");
                ArrayList<Integer> sorted = new ArrayList<Integer>();
                for(int num:list){
                        sorted.add(num);
                }
                Collections.sort(sorted);
                System.out.print("Sorted queue elements: " + sorted + "\n");
                break;
            case "Z":
                System.out.println("You want to know the size of the queue");
                System.out.println("The queue size is: " + list.size());
                break;
            case "T":
                System.out.println("You want to get the top element of the queue");
                System.out.println("The top element of the queue is: " + list.peek());
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}