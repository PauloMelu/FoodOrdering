import java.io.*;
import java.util.*;

public class ElectricCharges{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the KW hours used: ");
        int kw = in.nextInt();

        if(kw>1000)
            System.out.println((7633+(kw-1000)*9.259)/100);
        else
            System.out.println(kw*7.633/100);
    }
}