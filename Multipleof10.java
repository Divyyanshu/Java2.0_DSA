import java.util.*;

public class Multipleof10 {
    // using do while loop with using conditional break ;
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Enter the number :");
            int n = scn.nextInt();
            if (n % 10 == 0) {
                System.out.println("error bhai ji ");
                break;
            }
            System.out.println(n);

        } while (true);
    }
}
