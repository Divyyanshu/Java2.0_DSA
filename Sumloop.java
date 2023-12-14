import java.util.Scanner;

public class Sumloop {
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the value :");
        int range = scn.nextInt();
        int i = 1;
        int sum =0;
        while (i<=range) {
            sum = sum + i;
            i++;
        }
            System.out.println("sum loop :"+ sum);
    }
}
