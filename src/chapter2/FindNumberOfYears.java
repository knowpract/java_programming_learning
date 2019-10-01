package chapter2;
/*习题 2.7 Find the number of years*/
import java.util.Scanner;

public class FindNumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        long years = minutes / (365 * 24 * 60);
        long days = (minutes % (365 * 24 * 60)) / (24 * 60);
        System.out.println(minutes + "minutes is approximately " + years + " years and " + days + " days");
    }
}
