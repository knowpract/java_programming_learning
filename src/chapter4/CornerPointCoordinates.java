package chapter4;
/*习题 4.7*/
import java.util.Scanner;

public class CornerPointCoordinates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        double alpha1 = Math.toRadians(90 - 72);
        double alpha2 = Math.toRadians(90);
        double alpha3 = Math.toRadians(90 + 72);
        double alpha4 = Math.toRadians(90 + 72 + 72);
        double alpha5 = Math.toRadians(90 + 72 + 72 + 72);

        double x1 = radius * Math.cos(alpha1);
        double y1 = radius * Math.sin(alpha1);

        double x2 = radius * Math.cos(alpha2);
        double y2 = radius * Math.sin(alpha2);

        double x3 = radius * Math.cos(alpha3);
        double y3 = radius * Math.sin(alpha3);

        double x4 = radius * Math.cos(alpha4);
        double y4 = radius * Math.sin(alpha4);

        double x5 = radius * Math.cos(alpha5);
        double y5 = radius * Math.sin(alpha5);

        System.out.println("The coordinates of five points on the pentagon are");
        System.out.printf("(%.2f, %.2f)\n", x1, y1);
        System.out.printf("(%.2f, %.2f)\n", x2, y2);
        System.out.printf("(%.2f, %.2f)\n", x3, y3);
        System.out.printf("(%.2f, %.2f)\n", x4, y4);
        System.out.printf("(%.2f, %.2f)", x5, y5);
    }
}
