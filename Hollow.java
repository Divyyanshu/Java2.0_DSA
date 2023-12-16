import java.util.*;

public class Hollow{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int column = scn.nextInt();
           for(int i = 1 ; i <= row ; i++){
            for (int j = 1 ; j <= column ; j++){
                if (i == 1 || i == row || j ==1 || j == column){
                    System.out.print("*");
                } else {
                    System.err.print("");
                }
            }
            System.out.println();
           }
    }
}