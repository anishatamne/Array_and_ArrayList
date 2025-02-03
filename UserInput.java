import java.util.Scanner;

public class UserInput {
    private Scanner scanner; // Scanner object for user input

 // Constructor to initialize the Scanner object
    public UserInput() {
        scanner = new Scanner(System.in);
    }

    //Method to get an array of integers from the user.
    public int[] getNumbers() {
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();   // Read the number of elements
        int[] numbers = new int[n];   // Create an array of size n
         
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();     // Read each number and store in the array
        }
        return numbers;     // Return the filled array

    }
}