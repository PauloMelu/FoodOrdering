import java.util.*;
public class StudentsNameandGrade{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int[][][] grades = new int[2][2][2];
        String[] names = new String[2];
        String buffer;
        int sum=0;

        for(int i=0;i<2;i++){
            System.out.print("Enter name of a student: ");
            if(i!=0)
                buffer = in.nextLine();
            names[i] = in.nextLine();
            sum = 0;
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    System.out.printf("Enter grade %d : ",k+1+j*2);
                    grades[i][j][k] = in.nextInt();
                    sum += grades[i][j][k];
                }
            }
            System.out.println("The average is: " + sum/4);
            System.out.println();
        }
    }
}