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

    
// Convert the ArrayLists to arrays
int[] even = new int[evenList.size()];
int[] odd = new int[oddList.size()];

for (int i = 0; i < evenList.size(); i++) {
    even[i] = evenList.get(i);
}
for (int i = 0; i < oddList.size(); i++) {
    odd[i] = oddList.get(i);
}

System.out.println("Even numbers: " + Arrays.toString(even));
System.out.println("Odd numbers: " + Arrays.toString(odd));
}


public static int findMinDistanceNeighborIndex(int[] arr) {
    if (arr == null || arr.length < 2) {
        System.out.println("Array does not have enough elements to find neighbors.");
        return -1;
    }
    
    int minIndex = 0;
    int minDiff = Math.abs(arr[1] - arr[0]);
    
    for (int i = 1; i < arr.length - 1; i++) {
        int diff = Math.abs(arr[i + 1] - arr[i]);
        if (diff < minDiff) {
            minDiff = diff;
            minIndex = i;
        }
    }
    return minIndex;
}


public static ArrayList<Integer> arrayToArrayList(int[] array) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int num : array) {
        list.add(num);
    }
    return list;
}


public static int[] arrayListToArray(ArrayList<Integer> list) {
    int[] array = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
        array[i] = list.get(i);
    }
    return array;
    }
}