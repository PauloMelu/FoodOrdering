import java.util.*;
class MethodQuizBee{
    static Scanner in = new Scanner(System.in);
    static int score = 0;
    static String[] questions = {
                            "Question 1: What is the capital of the Philippines?\nA. Manila\tB. Canberra\tC. Quezon City\tD. Tokyo"
                            ,"Question 2: What is the capital of Japan?\nA. Manila\tB. Canberra\tC. Quezon City\tD. Tokyo"
                            ,"Question 3: What is the capital of Australia?\nA. Manila\tB. Canberra\tC. Quezon City\tD. Tokyo"
                            ,"Question 4: What is the factorial of 5?\nA. 122\tB. 121\tC. 120\tD. 125"
                            ,"Question 5: What is the first derivative of 2x?\nA. 2x\tB. x\tC. 1\tD. 2"
                            ,"Question 6: What is the first five fibonacci numbers?\nA. 0 1 2 3 4\nB. 1 1 2 3 5\nC. 0 1 1 2 3\nD. 0 1 3 5 7"
                            };
    static String[] answers = {"A","D","B","C","D","C"};
    public static void main(String[]args){
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        for(int i=0;i<questions.length;i++)
            askQuestion(i);
        System.out.println("Your total score is: " + score);
    }
    public static void askQuestion(int x){
        System.out.println(questions[x]);
        System.out.print("Your answer: ");
        String ans = in.nextLine();
        if(ans.equalsIgnoreCase(answers[x])){
            System.out.println("That is correct.");
            score++;
        }else{
            System.out.println("That is incorrect.");
        }
    }
}