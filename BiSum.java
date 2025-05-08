import java.util.*;

class BiSum {
    // Method to convert a decimal number to binary representation as an integer
    int decibi(int c, String s) {
        int p = c / 2;
        s = (Integer.toString(c % 2)) + s;
        if (p == 0) {
            s = s.trim();
            return (Integer.valueOf(s));
        } else {
            return (decibi(p, s));
        }
    }

    // Method to sum two binary numbers represented as integers
    String Sum(int a, int b) {
        String x = Integer.toString(a);
        String y = Integer.toString(b);
        String s = "";
        int l1 = x.length();
        int l2 = y.length();

        // Make the lengths of both binary strings equal by padding with leading zeros
        if (l1 > l2) {
            int t = l1 - l2;
            while (t != 0) {
                y = "0" + y;
                t = t - 1;
            }
        } else {
            int t = l2 - l1;
            while (t != 0) {
                x = "0" + x;
                t = t - 1;
            }
        }

        int n = 0; // Variable to store the carry
        for (int i = x.length() - 1; i >= 0; i--) {
            char c = x.charAt(i);
            char h = y.charAt(i);

            // Adding the binary digits with the carry
            if ((c == '0') && (h == '0')) {
                if (n == 1) {
                    s = "1" + s;
                    n = 0;
                } else {
                    s = "0" + s;
                }
            } else if ((c == '0') && (h == '1')) {
                if (n == 1) {
                    s = "0" + s;
                } else {
                    s = "1" + s;
                }
            } else if ((c == '1') && (h == '0')) {
                if (n == 1) {
                    s = "0" + s;
                } else {
                    s = "1" + s;
                }
            } else if ((c == '1') && (h == '1')) {
                if (n == 1) {
                    s = "1" + s;
                } else {
                    s = "0" + s;
                }
                n = 1;
            }
        }

        // Append the last carry if any
        s = (Integer.toString(n)) + s;
        return s;
    }

    public static void main() {
        Scanner in = new Scanner(System.in);
        BiSum ob = new BiSum();

        // Input decimal integers
        System.out.println("Enter Decimal Integers");
        long m = in.nextLong();
        long n = in.nextLong();
        int p = (int) m;
        int q = (int) n;

        // Convert decimal to binary
        int e = ob.decibi(p, "");
        int f = ob.decibi(q, "");

        // Print binary representation of the decimal numbers
        System.out.println("Binary of " + m + "= " + e);
        System.out.println("Binary of " + n + "= " + f);

        // Print the sum of the binary numbers
        System.out.println("Sum of " + e + " and " + f + "= " + ob.Sum(e, f));
    }
}
