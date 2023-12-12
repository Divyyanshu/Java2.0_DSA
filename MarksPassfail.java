import java.util.Scanner;

public class MarksPassfail {
    public static void main (String args []){
        Scanner S= new Scanner(System.in);
        int marks =S.nextInt();
        String result = (marks>=33)? "Pass" : "Fail";
        System.out.println("YOUR ARE :" + result);
    }
}
