import java.util.Scanner;

public class Areaofcircle {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        // Float a = scn.nextFloat();
        float radius = scn.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println(area);
    }
}
