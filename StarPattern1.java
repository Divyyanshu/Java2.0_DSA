

public class StarPattern1 {
    public static void main(String args[]){
        for (int line=1; line<=5; line++){
            // check line value for print star
            for (int star = 1 ; star<= line; star++){
                System.out.print("*");
            }
            // give next line
            System.out.println();
        }
    }
}
// dynamic input pattern *****

// public class StarPattern1 {
//     public static void main(String args[]){
//         Scanner s =new Scanner(System.in);
//         int n = s.nextInt();
//         for (int line=1; line<=n; line++){
//             // check line value for print star
//             for (int star = 1 ; star<= line; star++){
//                 System.out.print("*");
//             }
//             // gaive next line
//             System.out.println();
//         }
//     }
// }
