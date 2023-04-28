import java.util.*;
class DynamicLinkedListOperations{
    static Scanner in = new Scanner(System.in);
    static ArrayList<String> studentNum = new ArrayList<String>();
    static ArrayList<String> name = new ArrayList<String>();
    static ArrayList<String> address = new ArrayList<String>();
    static ArrayList<Integer> age = new ArrayList<Integer>();
    static ArrayList<String> course = new ArrayList<String>();

    public static void main(String[]args){
        

        System.out.print("What is the size of the Linkedlist? "); int size = in.nextInt();
        System.out.println("\nEnter the values of the LinkedList:");
        in.nextLine(); 
        for(int i=0;i<size;i++){
            record();
            System.out.println();
        }
        
        System.out.println("Press the letter for specific operation.\nA – Adding element to linked list/ Add element\nC – Changing elements/ Set element of Linkedlist by Student Number\nR – Removing elements/Delete element by Student number\nS – Searching elements in the linked list by Student Number\nX – Exit or End the Program");
        System.out.print("Type your option: "); String choice = in.nextLine();
        System.out.println();
        switch(choice){
            case "A" :
                choiceA();
                break;
            case "C" :
                choiceC();
                break;
            case "R" :
                choiceR();
                break;
            case "S" :
                choiceS();
                break;
            case "X" :
                System.out.println("Program ends or terminates...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.println("---All Records---");
        for(int i=0;i<studentNum.size();i++)
            display(i);
    }


    static void record(){
        System.out.print("Enter student number: "); studentNum.add(in.nextLine());
        System.out.print("Enter Name: "); name.add(in.nextLine());
        System.out.print("Enter Address: "); address.add(in.nextLine());
        System.out.print("Enter Age: "); age.add(in.nextInt()); in.nextLine();
        System.out.print("Enter Course: "); course.add(in.nextLine());
    }
    static void recordSet(int index){
        System.out.print("Enter student number: "); studentNum.set(index, in.nextLine());
        System.out.print("Enter Name: "); name.set(index, in.nextLine());
        System.out.print("Enter Address: "); address.set(index, in.nextLine());
        System.out.print("Enter Age: "); age.set(index, in.nextInt());
        in.nextLine(); System.out.print("Enter Course: "); course.set(index, in.nextLine());
    }
    static void display(int index){
        System.out.println("Enter student number: " + studentNum.get(index));
        System.out.println("Enter Name: " + name.get(index));
        System.out.println("Enter Address: " + address.get(index));
        System.out.println("Enter Age: " + age.get(index));
        System.out.println("Enter Course: " + course.get(index));
        System.out.println();
    }


    static void choiceA(){
        System.out.println("You want to add a new element.");
        record();
        System.out.println();
    }
    static void choiceC(){
        System.out.println("You want to change new element.");
        System.out.print("Enter the index of the element you want to change:"); int index = in.nextInt();
        System.out.println("\nRecords you want to change are:");
        display(index);
        in.nextLine();
        recordSet(index);
        System.out.println();
    }
    static void choiceR(){
        System.out.print("Enter the student number you want to delete: ");
        String toDelete = in.nextLine();
        if(!studentNum.contains(toDelete))
            System.out.println("No record found");
        else{
            int index = studentNum.indexOf(toDelete);
            studentNum.remove(index);
            name.remove(index);
            address.remove(index);
            age.remove(index);
            course.remove(index);
            System.out.println("Record successfully deleted");
        }
        System.out.println();
    }
    static void choiceS(){
        System.out.print("Enter student number to search: ");
        String toSearch = in.nextLine();
        if(!studentNum.contains(toSearch)){
            System.out.println("No record found");
            System.out.println();
        }else{
            System.out.println("Record exists");
            display(studentNum.indexOf(toSearch));
        }
    }

    
}