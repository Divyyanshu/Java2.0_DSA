import java.util.*;

public class Week {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int day = Scn.nextInt();
        switch (day) {
            case 1: System.out.println("Monday");
            break;
              case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thrusday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            default: System.out.println("Sunday");
                break;
        }
    }
}
