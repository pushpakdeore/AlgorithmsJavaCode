package pushpak9programming;

import java.util.Scanner;

public class j2prime_between1to100 {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        System.out.println("Prime numbers between " + a + " and " + b + ":");

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static class ReplaceZero {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer :");
            int number = scanner.nextInt();

            int modifiedNumber = replcezero(number);
            System.out.println(modifiedNumber);
        }
        public static int replcezero(int number){
            String numberSting = Integer.toString(number);
            String modifiedSting =numberSting.replace('0','1');
            return Integer.parseInt(modifiedSting);
        }

    }
}
