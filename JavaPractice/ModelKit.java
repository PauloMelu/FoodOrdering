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
//            int num = 0;
            int parts = 0;
            while(modelKits!=0){
//                num = 0;
                System.out.print("Parts and Connections: ");
                int numOfParts = in.nextInt(); int numOfConnections = in.nextInt();
                
                ArrayList<Integer> top = new ArrayList<Integer>();
                ArrayList<Integer> bot = new ArrayList<Integer>();
                
                for(int i=0;i<numOfConnections;i++){
                    System.out.print("bot and top: ");
                    bot.add(in.nextInt());
                    top.add(in.nextInt());
                }
                
                bot.removeAll(top);

                /*
                while(!top.isEmpty()){
                    num += Collections.frequency(top,top.get(0))-1;
                    ArrayList<Integer> topRemove = new ArrayList<Integer>();
                    topRemove.add(top.get(0));
                    top.removeAll(topRemove);
                }
                while(!bot.isEmpty()){
                    num += Collections.frequency(bot,bot.get(0))-1;
                    ArrayList<Integer> botRemove = new ArrayList<Integer>();
                    botRemove.add(bot.get(0));
                    bot.removeAll(botRemove);
                }
                */

                base -= bot.size();
                parts += numOfParts;
                modelKits--;
            }
                

            testCase--;
            if(base<0){
                System.out.println("Kulang base sadge :(");
                continue;
            }
            System.out.printf("Max parts used is: %d\n",parts);
        }

    }
}