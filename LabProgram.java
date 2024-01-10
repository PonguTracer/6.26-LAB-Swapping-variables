import java.util.Scanner;

public class LabProgram {

    // Method to swap values as per the specified indices
    public static void swapValues(int[] values) {
        // Swapping elements at indices 0 and 1
        int temp = values[0];
        values[0] = values[1];
        values[1] = temp;

        // Swapping elements at indices 2 and 3
        temp = values[2];
        values[2] = values[3];
        values[3] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[4];

        // Reading four integers from input and storing them in an array
        for (int i = 0; i < 4; i++) {
            values[i] = scanner.nextInt();
        }

        // Calling the swapValues method
        swapValues(values);

        // Printing the swapped values
        for (int i = 0; i < values.length; i++) {
            if (i == values.length - 1) {
                System.out.println(values[i]);
            } else {
                System.out.print(values[i] + " ");
            }

        }
        
    }
}
