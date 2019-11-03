package chapter4;

/*习题 4.26*/
import java.util.Scanner;

public class ThreeCountries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first country: ");
        String country1 = input.next();

        System.out.print("Enter the second country: ");
        String country2 = input.next();

        System.out.print("Enter the third country: ");
        String country3 = input.next();

        String descCountry1 = country1;
        String descCountry2 = country2;
        String descCountry3 = country3;

        if (descCountry1.compareTo(descCountry2) < 0) {
            String temp = descCountry1;
            descCountry1 = descCountry2;
            descCountry2 = temp;
        }

        if (descCountry1.compareTo(descCountry3) < 0) {
            String temp = descCountry1;
            descCountry1 = descCountry3;
            descCountry3 = temp;
        }

        if (descCountry2.compareTo(descCountry3) < 0) {
            String temp = descCountry2;
            descCountry2 = descCountry3;
            descCountry3 = temp;
        }

        System.out.println("The three countries in descending order are "
        + descCountry1 + " " + descCountry2 + " " + descCountry3);

    }
}
