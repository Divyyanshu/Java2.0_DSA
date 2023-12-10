import java.util.Scanner;
// use if esle condition for solve odd even number checker
public class OddEven {
    public static void main(String args[]){
        Scanner Scn = new Scanner(System.in);
        // use double is because check highest num values
        double num = Scn.nextDouble();
        if (num%2 == 0){
            System.out.println("this number is even");
        }
        else{
            System.out.println("this number is odd");
        }
    }
}
