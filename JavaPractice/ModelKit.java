import java.util.*;
public class ModelKit{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("Test case: ");
        int testCase = in.nextInt();

        while(testCase!=0){
            System.out.print("Base: ");
            int base = in.nextInt();
            System.out.print("Number of Model Kits: ");
            int modelKits = in.nextInt();

            int parts = 0;
            while(modelKits!=0){
                System.out.print("Parts and Connections: ");
                int numOfParts = in.nextInt(); int numOfConnections = in.nextInt();

                ArrayList<Integer> top = new ArrayList<Integer>();
                ArrayList<Integer> bot = new ArrayList<Integer>();

                for(int i=1;i<=numOfParts;i++)
                    bot.add(i);

                for(int i=0;i<numOfConnections;i++){
                    System.out.print("bot and top: ");
                    in.nextInt();
                    top.add(in.nextInt());
                }
                
                bot.removeAll(top);
                base = base - bot.size();
                if(base<0)
                    break;
                parts += numOfParts;
                modelKits--;
            }
            testCase--;
            System.out.printf("Max parts used is: %d\n",parts);
        }
    }
}