package pushpak9programming;
import java.util.Scanner;

public class LCM {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 == 0 || num2 == 0) {
            System.out.println("Both numbers must be non-zero.");
            return;
        }
        int lcmValue = lcm(num1, num2);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcmValue);

    }
}

