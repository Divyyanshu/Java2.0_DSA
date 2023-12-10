import java.util.Scanner;

// check the conditions by using if esle
public class Ifelse {
    public static void main (String args[]){
        Scanner scn = new Scanner (System.in);
        int age = scn.nextInt();
        if (age>=18){
            System.out.println(
                "YOU CAN DRIVE A CAR"
            );}
            if(age>=13 && age<18){
                System.out.println(
                "YOU CAN DRIVE A SCOOTY"
            );
            }
            else{
                System.out.println("YOU CAN NOT DIRIVE A CAR");
            }
        }
    }

