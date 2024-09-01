package pushpak9programming;
import java.util.Scanner;

public class j1Calculate_the_area_circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Area = π * r^2
        double area = Math.PI * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }


}
