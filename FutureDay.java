import java.util.*;

class FutureDay {
    public static void main() {
        Scanner in = new Scanner(System.in);

        // Input date in the format dd/mm/yyyy
        System.out.println("Enter the Date: ");
        String dt = in.nextLine();
        dt = dt.trim();
        dt = dt + " ";

        // Extracting day, month and year from the input date
        int l = dt.length();
        int i = dt.indexOf('/');
        int j = dt.lastIndexOf('/');
        int m = Integer.valueOf(dt.substring(i + 1, j));
        int d = Integer.valueOf(dt.substring(0, i));
        int y = Integer.valueOf(dt.substring(j + 1, l - 1));

        // Input the day of the week on 1st January of the given year
        System.out.println("Enter the Day on 1st January: ");
        String dy = in.nextLine();
        dy = dy.trim();

        // Array containing the days of the week
        String D[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        // Variable to store the index of the day
        int n = 1, x = 0;
        for (i = 0; i < 7; i++) {
            if (D[i].equals(dy)) {
                x = i;
                break;
            }
        }

        // Iterate over each month to find the day of the given date
        for (i = 1; i <= m; i++) {
            if ((i == m) && (d == n)) {
                break;
            }
            
            // Handling months with 30 days
            if ((i == 4) || (i == 6) || (i == 9) || (i == 11)) {
                while (n != 30) {
                    if (x == 6) {
                        x = -1;
                        continue;
                    }
                    x = x + 1;
                    n = n + 1;
                    if ((i == m) && (d == n)) {
                        break;
                    }
                }
                if ((i == m) && (d == n)) {
                    break;
                } else {
                    n = 1;
                    if (x == 6) {
                        x = 0;
                    } else {
                        x = x + 1;
                    }
                }
            }
            // Handling February
            else if (i == 2) {
                if (y % 4 == 0) {
                    while (n != 29) {
                        if (x == 6) {
                            x = -1;
                            continue;
                        }
                        x = x + 1;
                        n = n + 1;
                        if ((i == m) && (d == n)) {
                            break;
                        }
                    }
                    if ((i == m) && (d == n)) {
                        break;
                    } else {
                        n = 1;
                        if (x == 6) {
                            x = 0;
                        } else {
                            x = x + 1;
                        }
                    }
                } else {
                    while (n != 28) {
                        if (x == 6) {
                            x = -1;
                            continue;
                        }
                        x = x + 1;
                        n = n + 1;
                        if ((i == m) && (d == n)) {
                            break;
                        }
                    }
                    if ((i == m) && (d == n)) {
                        break;
                    } else {
                        n = 1;
                        if (x == 6) {
                            x = 0;
                        } else {
                            x = x + 1;
                        }
                    }
                }
            }
            // Handling months with 31 days
            else {
                while (n != 31) {
                    if (x == 6) {
                        x = -1;
                        continue;
                    }
                    x = x + 1;
                    n = n + 1;
                    if ((i == m) && (d == n)) {
                        break;
                    }
                }
                if ((i == m) && (d == n)) {
                    break;
                } else {
                    n = 1;
                    if (x == 6) {
                        x = 0;
                    } else {
                        x = x + 1;
                    }
                }
            }
        }
        
        // Output the day of the week for the given date
        System.out.println("Day on "+dt+": "+D[x]);
    }
}
