import java.util.*;
class SantasList{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String trail = in.nextLine();
        String[][] names = new String[num][2];
        for(int i=0;i<num;i++){
            for(int j=0;j<2;j++){
                names[i][j] = in.nextLine();
            }
        }
        System.out.println("---------------");
        for(int i=0;i<num;i++){
            if(names[i][0].compareToIgnoreCase(names[i][1])<0)
                System.out.println(names[i][0]);
            else if(names[i][0].compareToIgnoreCase(names[i][1])>0)
                System.out.println(names[i][1]);
            else
                System.out.println("SAME!");
        }
    }
}