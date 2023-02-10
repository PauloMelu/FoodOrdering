import java.io.*;

public class LoopingWithPatterns {
    public static void main (String [] args) {

        System.out.println("i.)");
        //i
        for(int i=0;i<4;i++){
            for(int j=0;j<10;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("ii.)");

        //ii
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("iii.)");

        //iii
        for(int i=5;i>0;i--){
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<6-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("iv.)");

        //iv
        for(int i=5;i>0;i--){
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<(6-i)*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("v.)");

        //v
        for(int i=5;i>0;i--){
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<(6-i)*2-1;j++){
                System.out.print(6-i);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("vi.)");

        //vi
        for(int i=5;i>0;i--){
            for(int j=i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int j=6-i;j>0;j--){
                System.out.print(j);
            }
            for(int j=2;j<=6-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }



    }
}



