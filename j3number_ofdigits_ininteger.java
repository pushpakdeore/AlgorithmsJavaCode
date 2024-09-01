package pushpak9programming;

import java.util.Scanner;

public class j3number_ofdigits_ininteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a =sc.nextInt();
        int count =0;
        int num = a;
        while(num !=0){
            int digit =num%10;
            count++;
            num/=10;

        }
        System.out.println(count);

    }
}
