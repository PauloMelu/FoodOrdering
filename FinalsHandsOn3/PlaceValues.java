import java.util.*;
class PlaceValues{
    static String[] placeValues = {"Ones", "Tens", "Hundreds", "Thousands", "Ten Thousand", "Hundred Thousand", "One Million", "Ten Million", "Hundred Million"};
    static int count[] = new int[9];

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of your chosen data structure: ");
        int size = in.nextInt();

        Stack<Integer> nums = new Stack<>();
        System.out.println("Enter the elements:");

        for(int i=0;i<size;i++){
            nums.add(in.nextInt());

            int digits = 0;
            int n = nums.peek();
            do{
                n /= 10;
                digits++;
            } while(n!=0);

            switch(digits){
                case 1:
                    count[0]++;
                    break;
                case 2:
                    count[1]++;
                    break;
                case 3:
                    count[2]++;
                    break;
                case 4:
                    count[3]++;
                    break;
                case 5:
                    count[4]++;
                    break;
                case 6:
                    count[5]++;
                    break;
                case 7:
                    count[6]++;
                    break;
                case 8:
                    count[7]++;
                    break;
                case 9:
                    count[8]++;
                    break;
            }
            
            
        }
        for(int i=0;i<count.length;i++)
            System.out.println(placeValues[i] + ": " + count[i]);
    }
}