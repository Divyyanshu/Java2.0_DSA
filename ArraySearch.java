import java.util.*;
 
public class ArraySearch {
    public static int getLargest(int numbers[]) {
        int largest = Interger.MIN_VALUE;
        for (int i =0 ; i< numbers.length ; i++);
        if(largest < numbers[i]){
            largest = numbers[i];
        }
        return largest;
    }

    public static void main(String args[]) {
int numbers[] = {1,5,6,4,2,8,9};
System.out.println("largest numbwer : " + getLargest(numbers));
    }
}