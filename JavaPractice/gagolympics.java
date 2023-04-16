import java.util.*;
class gagolympics{
    static String[][] translate = new String[][]{
        {
            ".###.",
            "#...#",
            "#....",
            "#.###",
            "#...#",
            "#...#",
            ".###."
        },
        {
            "..#..",
            ".#.#.",
            "#...#",
            "#####",
            "#...#",
            "#...#",
            "#...#"
        },
        {
            ".###.",
            "#...#",
            "#...#",
            "#...#",
            "#...#",
            "#...#",
            ".###."
        },
        {
            "#....",
            "#....",
            "#....",
            "#....",
            "#....",
            "#....",
            "#####"
        },
        {
            "#...#",
            "#...#",
            "#...#",
            ".###.",
            "..#..",
            "..#..",
            "..#.."
        },
        {
            "#.....#",
            "##...##",
            "#.#.#.#",
            "#..#..#",
            "#.....#",
            "#.....#",
            "#.....#"
        },
        {
            "####.",
            "#...#",
            "#...#",
            "####.",
            "#....",
            "#....",
            "#...."
        },
        {
            "#",
            "#",
            "#",
            "#",
            "#",
            "#",
            "#"
        },
        {
            ".###.",
            "#...#",
            "#....",
            "#....",
            "#....",
            "#...#",
            ".###."
        },
        {
            ".###.",
            "#...#",
            "#....",
            ".###.",
            "....#",
            "#...#",
            ".###."
        }
    };

    public static void main(String[]args){
        
        String given = "ALL";
        String given1 = "IS";
        String given2 = "COOL";
        convert(given);
        System.out.println();
        convert(given1);
        System.out.println();
        convert(given2);
    }

    static void convert(String word){
        
        for(int i=0;i<7;i++){
            int length = word.length();
            for(int j=0;j<word.length();j++){
                letterEquivalent(word.charAt(j), i, length);
                length--;
            }
            System.out.println();
        }
    }

    static void letterEquivalent(char letter, int index, int length){
        switch(letter){
            case 'G':
                System.out.print(translate[0][index]);
                break;
            case 'A':
                System.out.print(translate[1][index]);
                break;
            case 'O':
                System.out.print(translate[2][index]);
                break;
            case 'L':
                System.out.print(translate[3][index]);
                break;
            case 'Y':
                System.out.print(translate[4][index]);
                break;
            case 'M':
                System.out.print(translate[5][index]);
                break;
            case 'P':
                System.out.print(translate[6][index]);
                break;
            case 'I':
                System.out.print(translate[7][index]);
                break;
            case 'C':
                System.out.print(translate[8][index]);
                break;
            case 'S':
                System.out.print(translate[9][index]);
                break;
        }
        if(length!=1)
            System.out.print(".");
    }
}