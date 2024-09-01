package pushpak9programming;
import java.util.Scanner;

public class HCF {
    public static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 == 0 && num2 == 0) {
            System.out.println("Both numbers cannot be zero.");
            return;
        }

        int hcfValue = hcf(num1, num2);
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcfValue);

    }
}

