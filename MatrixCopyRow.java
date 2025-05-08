import java.util.*;
public class MatrixCopyRow {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        // 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Source index");
        int i= in.nextInt();
        System.out.println("Destination index");
        int j= in.nextInt();
        
        System.out.println("Origin copyline");
        int m= in.nextInt();
        int n= in.nextInt();
        int l= matrix[0].length;
        int row[]= new int[l];
        // Copy the first row using System.arraycopy()
        System.arraycopy(matrix[0], i, row[0], 0, l);

        // Print the 1D array
        for (int p : row) {
            System.out.print(i + " ");
        }
    }
}
