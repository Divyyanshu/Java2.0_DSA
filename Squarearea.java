import java.util.Scanner;

public class Squarearea {
    public static void main (String args []){
        Scanner scn = new Scanner(System.in);
        int side = scn.nextInt();
        int area = (side * side);
        System.out.print(area);
    }
}
