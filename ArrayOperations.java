import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOperations {
    public static void separateEvenOdd(int[] numbers) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }
