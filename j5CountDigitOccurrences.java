package pushpak9programming;
//Finding Number of times x digit occurs in a given input :
import java.util.Scanner;

public class j5CountDigitOccurrences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int number =sc.nextInt();
        System.out.print("Enter the Digit :");
        int digit = sc.nextInt();

        int cout=countOfDigit(number,digit);
        System.out.println("count of "+digit+" is "+cout);
    }
    public static int countOfDigit(int number,int digit){
        int cout =0;
        while(number!=0){
            int d =number%10;
            if(d==digit){
                cout++;
            }
            number/=10;
        }return cout;
    }


    public static class LCM {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            int lcm = findLCM(num1, num2);

            System.out.println("The Lowest Common Multiple (LCM) of " + num1 + " and " + num2 + " is: " + lcm);
        }

        public static int findLCM(int a, int b) {
            return (a * b) / findHCF(a, b);
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
