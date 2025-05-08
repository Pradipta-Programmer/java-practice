import java.util.*;
class Encoded {
    public static void main() {
        Scanner in = new Scanner(System.in);

        // Input the encoded text
        System.out.println("Enter the Encoded Text");
        String e = in.nextLine();
        e= e.toUpperCase();
        int l = e.length();//ZCQRKKMDKKISAI
        String r = "";
        int i = 0, j = 0;
        // Process each character in the encoded text
        while (i < l) {
            char c = e.charAt(i);
            if (Character.isLetter(c) == true) {
                // Special cases for character 'K'
                if (c == 'K') {
                    if (r.charAt(j - 1) == ' ') {
                        i = i + 2;
                    } else if (e.charAt(i + 1) == 'K') {
                        r = r + " ";
                        i = i + 2;
                    } else {
                        int t = (int) c;
                        t = t + 2;
                        r = r + ((char) t);
                        i = i + 1;
                    }
                }
                // Special cases for characters 'Y' and 'Z'
                else if (c == 'Y') {
                    r = r + "A";
                    i = i + 1;
                } else if (c == 'Z') {
                    r = r + "B";
                    i = i + 1;
                }
                // General case for other characters
                else {
                    int t = (int) c;
                    t = t + 2;
                    r = r + ((char) t);
                    i = i + 1;
                }
                j = r.length();
            } else {
                i = i + 1;
            }
        }

        String f = "";
        i = 0;
        r = r.toLowerCase();
        r = " " + r;
        j = r.length();

        // Capitalize the first letter of each word in the decoded text
        while (i < j) {
            char c = r.charAt(i);
            if (c == ' ') {
                f = f + " " + (Character.toUpperCase(r.charAt(i + 1)));
                i = i + 2;
            } else {
                f = f + c;
                i = i + 1;
            }
        }

        // Output the decoded text
        System.out.println(f);
    }
}
