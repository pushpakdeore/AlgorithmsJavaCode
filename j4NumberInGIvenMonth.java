package pushpak9programming;
import java.time.YearMonth;
import java.util.Scanner;
//ounting number of days in a given month of a year
public class j4NumberInGIvenMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();

        System.out.println("Number of days in " + yearMonth.getMonth() + " " + year + " is: " + daysInMonth);
    }

    public static class HighestCommonFactor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int hcf = findHCF(num1, num2);

            System.out.println("The Highest Common Factor (HCF) of " + num1 + " and " + num2 + " is: " + hcf);
        }

        public static int findHCF(int a, int b) {

            while (b != 0) {
                int remainder = a % b;
                a = b;
                b = remainder;
            }
            return a;
        }

    }
}
