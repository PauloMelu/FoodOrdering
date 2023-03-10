import java.util.*;
public class StringSearch{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        //get size of array
        System.out.print("Enter the number of table: ");
        int table = in.nextInt();
        System.out.print("Enter the number of rows of an array: ");
        int row = in.nextInt();
        System.out.print("Enter the number of columns of an array: ");
        int col = in.nextInt();
        System.out.println();
        
        //get input of names
        System.out.println("You need to input a total of " + table*row*col + " names, Input them now.");
        String[][][] names = new String[table][row][col];
        String buffer;
        for(int i=0;i<table;i++)
            for(int j=0;j<row;j++)
                for(int k=0;k<col;k++){
                    if(i==0 && j==0 && k==0){
                        buffer = in.nextLine();
                        names[i][j][k] = in.nextLine();
                    }else
                        names[i][j][k] = in.nextLine();
                }
        
        //remove repeating names to have an array of uniques names ignoring cases
        boolean repeat;
        ArrayList<String> namesButDiff = new ArrayList<String>();
        for(int i=0;i<table;i++)
            for(int j=0;j<row;j++)
                for(int k=0;k<col;k++){
                    repeat = false;
                    for(int l=0;l<namesButDiff.size();l++)
                        if(names[i][j][k].equalsIgnoreCase(namesButDiff.get(l)))
                            repeat = true;
                    if(!repeat)
                        namesButDiff.add(names[i][j][k]);
                }

        //count the number of occurences of names in the array of uniqe names from the original array of names
        int[] occurences = new int[namesButDiff.size()];
        for(int l=0;l<namesButDiff.size();l++)
            for(int i=0;i<table;i++)
                for(int j=0;j<row;j++)
                    for(int k=0;k<col;k++){
                        if(names[i][j][k].equalsIgnoreCase(namesButDiff.get(l)))
                            occurences[l]++;
                    }

        //print the unique names together with how much it occured
        for(int i=0;i<namesButDiff.size();i++){
            if(occurences[i]>1)
                System.out.println(namesButDiff.get(i) + " repeats " + occurences[i] + " times");
            else
                System.out.println(namesButDiff.get(i) + " repeats " + occurences[i] + " time");
        }
    }
}