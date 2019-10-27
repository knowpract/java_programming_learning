package chapter3;
/*习题 3.28  判断两个矩形是否重叠*/
import java.util.Scanner;

public class TwoRectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, " +
                "and height: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        System.out.print("Enter r2's center x-, y-coordinates, width, " +
                "and height: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        if (((Math.abs(x1 - x2) - width1 / 2.0 - width2 / 2.0) > 1e-6) && ((Math.abs(y1 - y2) - height1 / 2.0 - height2 / 2.0) > 1e-6)) {
            System.out.println("r2 does not overlap r1");
        } else if (((Math.abs(x1 - x2) + width2 / 2.0 - width1 / 2.0) < 1e-6) && ((Math.abs(y1 - y2) + height2 / 2.0 - height1 / 2.0) < 1e-6)) {
            System.out.println("r2 is inside r1");
        } else if (((Math.abs(x1 - x2) + width1 / 2.0 - width2 / 2.0) < 1e-6) && ((Math.abs(y1 - y2) + height1 / 2.0 - height2 / 2.0) < 1e-6)) {
            System.out.println("r1 is inside r2");
        } else {
            System.out.println("r2 overlaps r1");
        }
    }
}
