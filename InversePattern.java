import java.util.Scanner;

public class InversePattern {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the line of pattern what you want :");
        int n = s.nextInt();
        for (int line = 1; line<=n ;line++){
            for(int star = 1; star<= n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
