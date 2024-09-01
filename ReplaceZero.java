package pushpak9programming;
import java.util.Scanner;

public class ReplaceZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        String numberStr = String.valueOf(number);

        String modifiedNumberStr = numberStr.replace('0', '1');

        int modifiedNumber = Integer.parseInt(modifiedNumberStr);

        System.out.println("The modified integer is: " + modifiedNumber);

    }
}

