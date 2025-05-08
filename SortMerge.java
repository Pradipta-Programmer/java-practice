import java.util.*;
class SortMerge {
    // Method to sort an array using bubble sort
    int[] Sort(int E[]) {
        int l = E.length;
        int i, j;
        for (i = 0; i < l; i++) {
            for (j = 0; j < l - 1; j++) {
                if (E[j] > E[j + 1]) {
                    // Swap E[j] and E[j+1]
                    int t = E[j];
                    E[j] = E[j + 1];
                    E[j + 1] = t;
                }
            }
        }
        return E;
    }

    // Method to delete duplicate elements from a sorted array
    int[] DelDupli(int E[]) {
        int i = 0, j = 0, k = 0, f = 0;
        int l = E.length;
        while (i < l) {
            while (j < l) {
                if (E[i] == E[j]) {
                    f = f + 1;
                }
                j = j + 1;
            }
            if (f > 1) {
                f = f - 1;
                k = i;
                while (f != 0) {
                    while (k < l - 1) {
                        E[k] = E[k + 1];
                        k = k + 1;
                    }
                    f = f - 1;
                    l = l - 1;
                    k = i;
                }
            }
            i = i + 1;
            j = 0;
            f = 0;
        }
        int F[] = Arrays.copyOfRange(E, 0, l);
        return F;
    }

    // Method to merge two sorted arrays in ascending order
    int[] AscMerge(int E[], int F[]) {
        int m = E.length;
        int n = F.length;
        int[] G = new int[m + n];
        int i = 0, j = 0, k = 0;
        // Loop until one of the arrays is exhausted
        while (i < m && j < n) {
            if (E[i] <= F[j]) {
                G[k++] = E[i++];
            } else {
                G[k++] = F[j++];
            }
        }
        // If there are remaining elements in E, append them to G
        while (i < m) {
            G[k++] = E[i++];
        }
        // If there are remaining elements in F, append them to G
        while (j < n) {
            G[k++] = F[j++];
        }
        return G;
    }

    public static void main() {
        Scanner in =new Scanner(System.in);
        SortMerge ob = new SortMerge();

        // Input for the first array
        System.out.println("Enter the first array length");
        int x = in.nextInt();
        int A[] = new int[x];
        System.out.println("Enter the first array elements");
        for (int i = 0; i < x; i++) {
            A[i] = in.nextInt();
        }
        // Sort the first array
        A = ob.Sort(A);

        // Input for the second array with a check for length constraint
        System.out.println("Enter the second array length which has to be less than or equal to 20");
        int y = in.nextInt();
        int B[] = new int[y];
        if (y > 20) {
            System.out.println("ARRAY SIZE OUT OF RANGE");
            System.exit(0);
        } else {
            System.out.println("Enter the second array elements");
            for (int i = 0; i < y; i++) {
                B[i] = in.nextInt();
            }
        }
        // Sort the second array
        B = ob.Sort(B);

        // Merge the sorted arrays and remove duplicates
        int z = x + y;
        int C[] = new int[z];
        C = ob.AscMerge(A, B);
        C = ob.DelDupli(C);
        z = C.length;

        // Print the sorted arrays and the merged array
        System.out.print("Sorted Array A[]: ");
        for (int i = 0; i < x; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.print("Sorted Array B[]: ");
        for (int i = 0; i < y; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        System.out.print("Merged Array C[]: ");
        for (int i = 0; i < z; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}
