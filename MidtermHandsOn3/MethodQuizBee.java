import java.util.*;
class MethodQuizBee{
    static Scanner in = new Scanner(System.in);
    static int score = 0;
    public static void main(String[]args){
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
        questionSix();
        System.out.println("Your total score is: " + score);
    }
    public static void questionOne(){
        System.out.println("Question 1: What is the capital of the Philippines?");
        System.out.println("A. Manila\tB. Canberra\tC. Quezon City\tD. Tokyo");
        System.out.print("Your answer: ");
        String ans = in.nextLine();
        if(ans.equalsIgnoreCase("A")){
            System.out.println("That is correct.");
            score++;
        }else{
            System.out.println("That is incorrect.");
        }
    }
    public static void questionTwo(){
        System.out.println("Question 2: What is the capital of Japan?");
        System.out.println("A. Manila\tB. Canberra\tC. Quezon City\tD. Tokyo");
        System.out.print("Your answer: ");
        String ans = in.nextLine();
        if(ans.equalsIgnoreCase("D")){
            System.out.println("That is correct.");
            score++;
        }else{
            System.out.println("That is incorrect.");
        }
    }
    public static void questionThree(){
        System.out.println("Question 3: What is the capital of Australia?");
        System.out.println("A. Manila\tB. Canberra\tC. Quezon City\tD. Tokyo");
        System.out.print("Your answer: ");
        String ans = in.nextLine();
        if(ans.equalsIgnoreCase("B")){
            System.out.println("That is correct.");
            score++;
        }else{
            System.out.println("That is incorrect.");
        }
    }
    public static void questionFour(){
        System.out.println("Question 4: What is the factorial of 5?");
        System.out.println("A. 122\tB. 121\tC. 120\tD. 125");
        System.out.print("Your answer: ");
        String ans = in.nextLine();
        if(ans.equalsIgnoreCase("C")){
            System.out.println("That is correct.");
            score++;
        }else{
            System.out.println("That is incorrect.");
        }
    }
    public static void questionFive(){
        System.out.println("Question 5: What is the first derivative of 2x?");
        System.out.println("A. 2x\tB. x\tC. 1\tD. 2");
        System.out.print("Your answer: ");
        String ans = in.nextLine();
        if(ans.equalsIgnoreCase("D")){
            System.out.println("That is correct.");
            score++;
        }else{
            System.out.println("That is incorrect.");
        }
    }
    public static void questionSix(){
        System.out.println("Question 6: What is the first five fibonacci numbers?");
        System.out.println("A. 0 1 2 3 4\nB. 1 1 2 3 5\nC. 0 1 1 2 3\nD. 0 1 3 5 7");
        System.out.print("Your answer: ");
        String ans = in.nextLine();
        if(ans.equalsIgnoreCase("C")){
            System.out.println("That is correct.");
            score++;
        }else{
            System.out.println("That is incorrect.");
        }
    }
}