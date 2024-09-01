package pushpak9programming;
import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String octal = decimalToOctal(decimal);
        System.out.println("Octal equivalent: " + octal);

    }

    public static String decimalToOctal(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder octal = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 8;
            octal.append(remainder);
            decimal = decimal / 8;
        }

        return octal.reverse().toString();
    }

}
