import java.util.*;

class Rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int i = 2;
        int g = n;
        boolean isHamming = true;

        System.out.print(n + " = ");
        while (i <= n) {
            if (n % i == 0) {
                if (n / i != 1) {
                    System.out.print(i + " X ");
                } else {
                    System.out.print(i);
                }
                
                if (i != 2 && i != 3 && i != 5) {
                    isHamming = false;
                }

                n = n / i;
                continue;
            }
            i = i + 1;
        }

        System.out.println();
        if (isHamming) {
            System.out.println(g + " is a Hamming Number");
        } else {
            System.out.println(g + " is not a Hamming Number");
        }
    }
}
