package chapter3;
/*习题 3.19 输入三条边的长度，判断是否可以构成一个三角形*/
import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input three edges for a triangle: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();
        if (((edge1 + edge2) - edge3 > 1e-6) &&
                (((edge1 + edge3) - edge2 > 1e-6)) &&
                (((edge2 + edge3) - edge1 > 1e-6))) {
            System.out.println("the input is valid !");
        } else {
            System.out.println("the input is invalid !");
        }
    }
}
