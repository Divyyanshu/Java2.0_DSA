import java.util.Scanner;

public class ternary {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        // use tranary operator condition >>>>>>.....!
        // variable = condition ? statement1 : statement2;

        String type  = ((number%4)==0)? "even" : "odd";
        System.out.println(type);
    }
}
