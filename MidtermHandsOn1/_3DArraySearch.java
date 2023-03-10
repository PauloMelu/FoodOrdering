import java.util.*;
public class _3DArraySearch{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int[][][] arr = new int[2][2][5];
        int pos,neg,zero,odd,even;
        pos=neg=zero=odd=even=0;
        System.out.println("Enter values of 3D Array:");
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<5;k++){
                    arr[i][j][k] = in.nextInt();
                    if(arr[i][j][k]>0)
                        pos++;
                    else if(arr[i][j][k]<0)
                        neg++;
                    else
                        zero++;
                    if(arr[i][j][k]%2==0)
                        even++;
                    else
                        odd++;
                }
        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of 0s: " + zero);
    }
}