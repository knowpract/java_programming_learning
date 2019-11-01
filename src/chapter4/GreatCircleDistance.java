package chapter4;
/*习题 4.2 计算地球两点之间的球面距离*/
import java.util.Scanner;

public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        Double latitude1 = Math.toRadians(input.nextDouble());
        Double longtitude1 = Math.toRadians(input.nextDouble());


        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        Double latitude2 = Math.toRadians(input.nextDouble());
        Double longtitude2 = Math.toRadians(input.nextDouble());
        double d = 6371.01 * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) +
                Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longtitude1 - longtitude2));

        System.out.println("The distance between the two points is " + d + " km");
    }
}
