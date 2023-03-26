import java.util.*;
public class ArrayListStringSearch{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<Integer> occurrences = new ArrayList<Integer>();

        System.out.print("Enter the size of the ArrayList: ");
        int num = in.nextInt();
        String catchTrailingNewLine = in.nextLine();

        System.out.printf("\nYou need to input a total of %d names, Input them now.\n",num);
        for(int i=0;i<num;i++){
            boolean contain = false;
            String name = in.nextLine();
            int index=0;
            for(int j=0;j<arr.size();j++){
                if(arr.get(j).equalsIgnoreCase(name)){
                    contain = true;
                    index = j;
                }
            }
            if(contain){
                occurrences.set(index, occurrences.get(index)+1);
            }else{
                arr.add(name);
                occurrences.add(1);
            }
        }

        for(int i=0;i<arr.size();i++){
            if(occurrences.get(i)>1)
                System.out.println(arr.get(i) + " repeats " + occurrences.get(i) + " times");
            else
                System.out.println(arr.get(i) + " repeats " + occurrences.get(i) + " time");
        }

    }
}