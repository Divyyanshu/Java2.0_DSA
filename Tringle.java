import java.util.Scanner;

public class Tringle {
    public static void main (String args[]){
        Scanner Scn = new Scanner( System.in);
        float lenght = Scn.nextFloat();
        float breadth = Scn.nextFloat();
        float Areaoftringle = 0.5f *(lenght * breadth);
    System.out.println("AREA OF TRIANGLE IS :"+Areaoftringle);
    }
}
