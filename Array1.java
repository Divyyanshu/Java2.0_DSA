import java.util.Scanner;

public class Array1 {
    public static void main(String args[]) {
        int marks[] = new int[100];

        Scanner scn = new Scanner(System.in);

        marks[0] = scn.nextInt(); // eng
        marks[1] = scn.nextInt(); // phy
        marks[2] = scn.nextInt(); // chem
        marks[3] = scn.nextInt(); // maths

        System.out.println("eng : " + marks[0]);
        System.out.println("phy : " + marks[1]);
        System.out.println("chem : " + marks[2]);
        System.out.println("maths : " + marks[3]);
    }
}
