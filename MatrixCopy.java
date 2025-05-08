import java.util.Scanner;

public class MatrixCopy {
    public static void main(String[] args) {
        // Define a 2D matrix
        int[][] matrix = {
            {1, 4, 3, 8, 5},
            {6, 2, 8, 6, 9}
        };

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user inputs for source index, destination index, and length
        System.out.print("Enter the starting index to copy from in the source array: ");
        int sourceStartIndex = scanner.nextInt();

        System.out.print("Enter the starting index to copy into in the destination array: ");
        int destStartIndex = scanner.nextInt();

        System.out.print("Enter the number of elements to copy: ");
        int length = scanner.nextInt();

        // Validate the inputs
        if (sourceStartIndex < 0 || destStartIndex < 0 ||
            sourceStartIndex + length > matrix[0].length || destStartIndex + length > matrix[0].length) {
            System.out.println("Invalid indices or length. Please make sure they are within bounds.");
            return;
        }

        // Create a 1D array to store the copied elements
        int[] row = new int[length];

        // Copy the specified part of the first row to the 1D array
        System.arraycopy(matrix[0], sourceStartIndex, row, destStartIndex, length);

        // Print the 1D array to verify the result
        System.out.print("Copied array: ");
        for (int value : row) {
            System.out.print(value + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
