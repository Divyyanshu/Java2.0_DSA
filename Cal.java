import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value a :");
        int a = scn.nextInt();
        System.out.println("Enter value b :");
        int b = scn.nextInt();
        // charAt = 0 for compare char operter ;
        System.out.println("Enter operator :");
        char operator = scn.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("jai shree ram");
                break;
        }
    }
}
