import java.util.Scanner;

public class RevLoop2 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number :");
        int number = scn.nextInt();
        int reverse = 0;
        while(number>0){
            int lastdigit = number%10;
            reverse = (reverse*10)+lastdigit;
            number = number/10;
        }
        System.out.println("Reverse of the number :"+reverse);
    }
}
