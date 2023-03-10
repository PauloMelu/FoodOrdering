import java.util.*;
public class _3DSumofNumbers{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Enter the number of table: ");
        int table = in.nextInt();
        System.out.print("Enter the number of rows of an array: ");
        int row = in.nextInt();
        System.out.print("Enter the number of columns of an array: ");
        int col = in.nextInt();
        System.out.println();

        int[][][] arr = new int[table][row][col];
        int sum=0,oddsum=0;
        for(int i=0;i<table;i++)
            for(int j=0;j<row;j++)
                for(int k=0;k<col;k++){
                    System.out.printf("The value of an array at index %d %d %d: ",i,j,k);
                    arr[i][j][k] = in.nextInt();
                    sum += arr[i][j][k];
                    if(arr[i][j][k]%2!=0)
                        oddsum += arr[i][j][k] ;
                }
        
        System.out.println();
        System.out.println("The sum of odd numbers is: " + oddsum);        
        System.out.println("The sum of all inputted numbers is: " + sum);
    }
}