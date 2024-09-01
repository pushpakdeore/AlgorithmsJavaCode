package pushpak9programming;

import java.util.Scanner;

public class GCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("The Greatest Common Divisor (GCD) of " + num1 + " and " + num2 + " is: " + gcd);

    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static class ok {
    }
}


