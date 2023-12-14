import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        if (number == 2) {
            System.out.println("Prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not Prime number");
            }
        }

    }
}
