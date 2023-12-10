import java.util.Scanner;
// Bill of Items
public class Problem1 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        float pencil = scn.nextFloat();
        float pen = scn.nextFloat();
        float rubber = scn.nextFloat();
        float totalAmountofbill = pen+ pencil+ rubber;
        System.out.println("totalbill of products:" + totalAmountofbill);

        //Add on - with 18% tax
        
        float withgst = totalAmountofbill+ (0.18f * totalAmountofbill);
        System.out.println("totalbill of products with 18% gst :"+withgst);
    }
}
