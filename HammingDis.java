import java.util.*;

class HammingDis {
    // Method to convert a decimal number to its binary representation
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

    // Method to calculate the Hamming distance between two binary strings
    int HamDis(String x, String y) {
        int i, f = 0;
        for (i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            char h = y.charAt(i);
            if (c != h) {
                f = f + 1;
            }
        }
        return f;
    }

    public static void main() {
        Scanner in = new Scanner(System.in);
        HammingDis ob = new HammingDis();

        // Input the decimal numbers N and M
        System.out.println("Enter the N");
        int n = in.nextInt();
        System.out.println("Enter the M");
        int m = in.nextInt();

        // Convert decimal numbers to binary strings
        String x = Integer.toString(ob.decibi(n, ""));
        String y = Integer.toString(ob.decibi(m, ""));

        // Equalize the lengths of the binary strings by padding with leading zeros
        int l1 = x.length();
        int l2 = y.length();
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

        // Calculate the Hamming distance between the two binary strings
        int count = ob.HamDis(x, y);

        // Output the binary patterns and the Hamming distance
        System.out.println("Bit Pattern of N= " + x);
        System.out.println("Bit Pattern of M= " + y);
        System.out.println("Hamming Distance= " + count);
    }
}