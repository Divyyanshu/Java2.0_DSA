import java.util.Scanner;

public class Reverseloop {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number:");
        int number = scn.nextInt();
        while(number>0){
            int lastdigit = number%10;
            System.out.print(lastdigit);
            number = number/10;
        }
        System.out.println();
    }
}
