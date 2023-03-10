public class ThreeDimensionalArray{
    public static void main(String[]args){
        int[][][] arr = {
            {
                {80,90,100,20},
                {25,26,23,100}
            },
            {
                {55,-16,-17,18},
                {12,12,13,114}
            }
        };
        System.out.println("3-D array values");
        System.out.println();
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<4;k++)
                    System.out.printf("arr[%d][%d][%d] = %d\n",i,j,k,arr[i][j][k]);
    }
}