import java.util.*;
import java.io.*;

public class FinalProject{
    static Scanner in = new Scanner(System.in);
    public static void main(String[]args){
        
        System.out.println("You are about to make an order.\nPress Enter to Continue...");
        in.nextLine();
        double finalCost = 0;
        System.out.printf("Choose an option:\n> Menu\n> Your Order (%.2f)\n",finalCost);
        String choice = in.nextLine();
        if(choice.equalsIgnoreCase("menu")){
            menu();
        }else if(choice.equalsIgnoreCase("order")){
            displayOrder();
        }
    }

    static void menu(){
        System.out.println("Chicken - P150.00");
        System.out.println("Beef - P350.00");
        System.out.println("Pork - P349.00");
        System.out.println("Lamb - P250.00");
    }

    static void displayOrder(){
        
    }

}

class FoodItems {
    String name;
    int price;
}