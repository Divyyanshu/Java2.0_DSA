import java.util.Scanner;

public class SumInput {
    public static void main (String args []){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = a+b;
        int sub = a-b;
        int multiply = a*b;
        int divide = a/b;
        int modules = a%b;
        System.out.println(sum);
          System.out.println(sub);
            System.out.println(multiply);
              System.out.println(modules);
                System.out.println(divide);
    }

}
