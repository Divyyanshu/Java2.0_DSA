import java.util.*;

public class function {
    public static void helloWorld() {
        System.out.println("hello ji");
        System.out.println("jai shree ram");
        System.out.println("kya baat hai");
        System.out.println("divyanshu ji");
        System.out.println("interview hai mera");
    }

    public static int CalculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("sum is : " + sum);
        return sum;
    }
     public static int CalculateSub(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println("sub is : " + sub);
        return sub;
    }
     public static int Calculatemultiply(int num1, int num2) {
        int multi = num1 * num2;
        System.out.println("multi is : " + multi);
        return multi;
    }
     public static int Calculatedivide(int num1, int num2) { //parameters 
        int divide = num1 / num2;
      
        System.out.println("Divide is : " + divide);
        return divide;
    }


    public static void main(String args[]) {
        // helloWorld();

        Scanner s = new Scanner(System.in);
        System.out.println("enter value a : ");
        int a = s.nextInt();

        System.out.println("enter value b : ");
        int b = s.nextInt();

        CalculateSum(a,b);   //arrguments 
        CalculateSub(a, b);
        Calculatemultiply(a, b);
        Calculatedivide(a, b);
    }
}
