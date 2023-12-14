import java.util.Scanner;
// print pattern of star using input :
public class Patternloop1 {
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("ENTER PATTERN :");
        int n = scn.nextInt();
        for (int line = 1; line <=n ;line++){
            System.out.println("* * * * *");
        }
    }
}
