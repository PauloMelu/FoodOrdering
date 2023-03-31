import java.util.*;
class MethodArrayListStringSearch{
    static Scanner in = new Scanner(System.in);
    
    public static void main(String[]args){
        ArrayList<String> arr = new ArrayList<String>();
        arr = getNames(arr);
        ArrayList<String> uniqueNames = listOfUniqueNames(arr);
        int[] nameCount = nameCounter(arr,uniqueNames);
        for(int i=0;i<nameCount.length;i++){
            if(nameCount[i]>1)
                System.out.println(uniqueNames.get(i) + " repeats " + nameCount[i] + " times");
            else
                System.out.println(uniqueNames.get(i) + " repeats " + nameCount[i] + " time");
        }
    }

    public static ArrayList<String> getNames (ArrayList<String> arr){
        System.out.print("Enter the size of the Array List: ");
        int num = in.nextInt();
        System.out.printf("You need to input a total of %d names, input them now.\n",num);
        String catchnewline = in.nextLine();
        for(int i=0;i<num;i++)
            arr.add(in.nextLine());
        return arr;
    }

    public static ArrayList<String> listOfUniqueNames (ArrayList<String> arr){
        ArrayList<String> arrayToReturn = new ArrayList<String>();
        boolean contains = false;
        for(String elem:arr){
            contains = false;
            for(String elem2:arrayToReturn)
                if(elem.equalsIgnoreCase(elem2))
                    contains = true;
            if(!contains)
                arrayToReturn.add(elem);
        }
        return arrayToReturn;
    }

    public static int[] nameCounter(ArrayList<String> names, ArrayList<String> uniqueNames){
        int[] counts = new int[uniqueNames.size()];
        
        for(int i=0;i<uniqueNames.size();i++){
            for(int j=0;j<names.size();j++){
                if(uniqueNames.get(i).equalsIgnoreCase(names.get(j)))
                    counts[i]++;
            }
        }

        return counts;
    }
}