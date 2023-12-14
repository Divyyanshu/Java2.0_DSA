public class Swap {

    public static void Swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    public static void main(String[] args) {
        int a = 45;
        int b = 20;
//CALL BY VALUE MAKE A VARIABLE COPY AND PASS IN THE PARAMENTER
        Swap(a, b);
        // swap the values
        // System.out.println("A = " + a);
        // System.out.println("B = " + b);
    }
}
