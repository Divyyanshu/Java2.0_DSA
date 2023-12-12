import java.util.*;

public class Switch {
    public static void main(String args[]) {
        Scanner Scn = new Scanner(System.in);
        int number = Scn.nextInt();
        switch (number) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("cold drink");
                break;
            case 3:
                System.out.println("kachori");
                break;
            case 4:
                System.out.println("pizza");
                break;
            case 5:
                System.out.println("burger");
                break;
            case 6:
                System.out.println("milk shake");
                break;
            default:
                System.out.println("wake up to reality brother good moring !");
                break;
        }
    }
}
