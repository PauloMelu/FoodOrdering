import java.util.*;

class aliendefense{
    public static void main(String[]args){
        int attackzone = 2;
        int firstcoord[] = {0,0};
        int lw1[] = {3,3}; 
        int secondcoord[] = {1,-1};
        int lw2[] = {5,5};

        int width = xintersect(firstcoord[0],secondcoord[0],lw1[0],lw2[0]);
    }

    static int xintersect(int fstcords, int sndcords, int width1, int width2){
        if(fstcords<sndcords)
            return width1 + width2 - (sndcords+width2-fstcords);
        else
            return width1 + width2 - (fstcords+width1-sndcords);
    }

}