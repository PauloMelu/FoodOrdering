import java.util.*;
public class TwoDimensionalSumEvenNegativeNumbers{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int[][][] arr = new int[3][2][3];
        int evensum=0,negsum=0;
        System.out.println("Enter the values of the 3D-array:");
        for(int i=0;i<3;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<3;k++){
                    arr[i][j][k] = in.nextInt();
                    if(arr[i][j][k]%2==0)
                        evensum += arr[i][j][k];
                    if(arr[i][j][k]<0)
                        negsum += arr[i][j][k];
                }
        System.out.println("The sum of even numbers is: " + evensum);
        System.out.println("The sum of negative numbers is: " + negsum);
    }
}