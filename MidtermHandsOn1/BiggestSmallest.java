import java.util.*;
public class BiggestSmallest{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int[][][] arr = new int[3][2][3];
        int max=0,min=0;

        System.out.println("Enter the values of the 3-D array:");
        for(int i=0;i<3;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<3;k++){
                    arr[i][j][k] = in.nextInt();
                    if(i==0 && j==0 && k==0)
                        max = min = arr[i][j][k];
                    else if(arr[i][j][k]>max)
                        max = arr[i][j][k];
                    else if(arr[i][j][k]<min)
                        min = arr[i][j][k];
                }
        System.out.println("The highest value is: " + max);
        System.out.println("The smallest value is: " + min);
    }
}