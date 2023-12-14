import java.util.Scanner;

public class DowhileContinue {
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("Enter the number :");
            int n = scn.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("Non multiple of ten :"+n);
        }while(true);
    }
}
