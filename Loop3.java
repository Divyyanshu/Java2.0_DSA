import java.util.Scanner;
// print n lekr input me 1 to 10 
public class Loop3 {
    public static void main(String args []){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the value :");
        int n = scn.nextInt();
        int counter = 0;
        while (counter <= n) {
            System.out.println(counter);
            counter++;
        }
        System.out.println("jai shree ram end the loop");
    }
}
