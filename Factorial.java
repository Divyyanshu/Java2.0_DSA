import java.util.*;

public class Factorial {
    public static int factorial(int n){
        int f =1;
        for(int i = 1 ; i <= n ;i++){
            f = f*i;
        }
        return f;
    }
// main function call stack working call the factorial function form the up word 👍
    public static void main (String args[]){
        Scanner scn =new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = scn.nextInt();
         System.out.println("factorial of n : "+factorial (n));
    }
}
  

