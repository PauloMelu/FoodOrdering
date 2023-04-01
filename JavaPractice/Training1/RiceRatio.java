import java.util.*;
class RiceRatio{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int w = in.nextInt();
        ratio(r,w);
    }
    public static void ratio(int r, int w){
        if(r*3 == w)
            System.out.println("THE RICE IS RIGHT!");
        else if(r*3 < w)
            System.out.println("WE NEED MORE RICE.");
        else
            System.out.println("WE NEED MORE WATER.");
    }
}