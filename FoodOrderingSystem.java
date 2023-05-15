import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
class FinalsProject{
    static Scanner in = new Scanner(System.in);
    static double payment;
    static ArrayList<FoodItems> cart = new ArrayList<>(); //orders of user
    public static void main(String[]args){

        //get menu from csv file
        try {
            Scanner reader = new Scanner(new File("/Users/Melu/Documents/Code/Finals Project DSA/menu.csv"));
            reader.nextLine();
            reader.useDelimiter(",|\r\n");
            int i=0;
            while (reader.hasNext()) {
                if (reader.hasNextDouble())
                    cart.get(i++).price = reader.nextDouble();
                else {
                    cart.add(new FoodItems());
                    cart.get(i).name = reader.next();
                }
            }
        } catch (FileNotFoundException e){
            unavailable();
        }
        if(cart.size()==0)
            unavailable();

        //start of program
        System.out.print("\033[H\033[2J"); //clear console
        System.out.println("You are about to make an order.\nPress Enter to Continue...");
        in.nextLine();
        System.out.print("\033[H\033[2J"); //clear console

        //name of user
        System.out.print("Enter your name: ");
        String name = in.nextLine();

        //start of ordertaker
        boolean cont = true;
        boolean choiceError = false;
        while(cont){
            System.out.print("\033[H\033[2J"); //clear console
            boolean paid = false;
            try {
                int choice = mainMenu(choiceError);
                choiceError = false;
                if (choice == 1) {
                    in.nextLine(); //catch newline after mainmenu input
                    getOrder(name, false, "", false);
                } else if (choice == 2) {
                    in.nextLine(); //catch newline after mainmenu input
                    paid = paymentMenu(cost(), false);
                }
                else if (choice == 3) {
                    cont = false;
                    System.out.print("\033[H\033[2J"); //clear console
                    System.out.println("Thank you for using, have a nice day!");
                }else {
                    choiceError = true;
                    in.nextLine(); //catch newline after mainmenu input
                }
            } catch (InputMismatchException e){
                choiceError = true;
                in.nextLine(); //catch newline after mainmenu input
            }
            if (paid) {
                System.out.print("\033[H\033[2J"); //clear console
                receipt(name, payment);
                cont = false;
            }
        }
    }
    static void unavailable(){
        System.out.print("\033[H\033[2J"); //clear console
        System.out.println("Menu is out of order, sorry for the inconvenience.");
        System.out.println("Press enter");
        in.nextLine();
        System.out.print("\033[H\033[2J"); //clear console
        System.exit(0);
    }
    static void receipt(String name, double payAmount){
        System.out.println("----RECEIPT----\n");
        System.out.println("Customer name: " + name);
        System.out.println("Order list:");
        for(FoodItems items : cart){
            if(items.quantity>0){
                System.out.printf("%d %s - P%.2f\n", items.quantity, items.name, items.price* items.quantity);
            }
        }
        System.out.printf("\nTotal cost: P%.2f\n", cost());
        System.out.printf("Total Payment: P%.2f\n", payAmount);
        System.out.printf("Change: P%.2f\n", payAmount - cost());
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("\n" + dateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mma")));
        System.out.println("\n---------------");
        System.out.println("\nYour order will be ready in 20 minutes,\nThank you for using the system, have a nice day!");
    }
    static int mainMenu(boolean error){
        System.out.println("       MAIN MENU");
        System.out.println("--------------------------");
        System.out.println("-                        -");
        System.out.println("- (1) Add Order          -");
        System.out.println("- (2) Proceed to Payment -");
        System.out.println("- (3) Exit               -");
        System.out.println("-                        -");
        System.out.println("--------------------------\n");
        if(error)
            System.out.print("Invalid choice, try again");
        System.out.print("\nEnter an option: ");
        return in.nextInt();
    }
    static boolean paymentMenu(double totalCost, boolean notEnough){
        System.out.print("\033[H\033[2J"); //clear console
        System.out.println("   MAIN MENU >> PAYMENT MENU\n");
        if(totalCost>0) {
            displayOrder(); //display cart
            System.out.printf("Total cost: P%.2f\n", totalCost);
            System.out.println("Type any to go back\n");
            paymentError(notEnough);
            System.out.print("Enter amount to pay: P");
            try {
                payment = in.nextDouble();
                in.nextLine(); //catch newline after payment input
                if(payment<totalCost){
                    return paymentMenu(totalCost, true);
                }
                System.out.printf("Your change is: P%.2f\n", payment - totalCost);
                System.out.println("Press enter to proceed...");
                in.nextLine(); //prompt to press enter, then go back to mainmenu loop
                return true;
            }catch(InputMismatchException e){
                in.nextLine(); //catch newline after invalid input on payment
                return false;
            }
        }else{
            System.out.println("No orders added");
            System.out.println("Press enter to continue..");
            in.nextLine(); //prompt to press enter then go back to mainmenu loop in main
            return false;
        }
    }
    static void paymentError(boolean notEnough){
        if(notEnough)
            System.out.print("Error: Not Enough Payment");
        System.out.println();
    }
    static void getOrder(String name, boolean foodNameError, String order, boolean quantityError){
        System.out.print("\033[H\033[2J"); //clear console
        System.out.println("   MAIN MENU >> GET ORDER\n");
        System.out.print("Hi " + name + ", "); displayOrder(); //display cart
        System.out.printf("Total cost: P%.2f\n\n",cost());
        menu(); //display menu
        System.out.println("\nType \"..\" to go back.\n");

        //display error from previous if any
        displayError(order, foodNameError, quantityError);

        //enter food name
        System.out.print("Enter Food Product: ");
        order = in.nextLine();    //get food name
        if(order.equalsIgnoreCase("..")) //exit option
            return;

        //check if food name is valid, repeat if not
        for(FoodItems items : cart) {
            if (order.equalsIgnoreCase(items.name)) {
                foodNameError = false;
                break;
            } else {
                foodNameError = true;
            }
        }
        if(foodNameError) {
            getOrder(name, foodNameError, order, false);
            return;
        }

        //get quantity
        System.out.print("Quantity: ");
        // try if quantity is valid then continue to put
        // input in cart else it is caught with quantity error
        try {
            int qty = in.nextInt(); //get food quantity
            in.nextLine(); //catch newline after qty input
            //put inputs in cart
            for(FoodItems items : cart)
                if (order.equalsIgnoreCase(items.name)) {
                    items.quantity += qty;
                    if (items.quantity < 0) items.quantity = 0;
                    break;
                }
            getOrder(name, false, order, false);
        }catch (InputMismatchException e){ //check if quantity invalid, repeat if not
            in.nextLine(); //catch newline after invalid qty input
            getOrder(name, false, order, true);
        }
    }
    static void menu(){ //prints the menu
        System.out.println("What would you like to order?");
        System.out.println("-----MENU-----");
        for(FoodItems items : cart)
            System.out.printf("%s - P%.2f\n",items.name,items.price);
    }
    static void displayOrder(){ //displays queue of order
        System.out.print("your current orders are: ( ");
        boolean morethanone = false;
        for (FoodItems foodItems : cart) {
            if (foodItems.quantity > 0) {    //if statement to show food items with more than 0 quantity ordered
                if (morethanone)      //if statement to determine if ordered item is more than 1 then place a ':' seperator for each item
                    System.out.print(" : ");
                morethanone = true;
                System.out.print(foodItems.quantity + " " + foodItems.name);
            }
        }
        System.out.println(" )");
    }
    static void displayError(String foodname, boolean foodNameError, boolean quantityError){
        if(foodNameError) {
            System.out.print("Error: \"" + foodname + "\" is not part of menu");
        }
        if(quantityError) {
            System.out.print("Error: Quantity Invalid");
        }
        System.out.println();
    }
    static double cost(){
        double total = 0;
        for(FoodItems items : cart){
            total += items.quantity * items.price;
        }
        return total;
    }

}
class FoodItems {
    String name;
    int quantity;
    double price;
}
