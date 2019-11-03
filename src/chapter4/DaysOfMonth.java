package chapter4;

/*习题 4.17*/
import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        input.nextLine();
        System.out.print("Enter a month: ");
        String month = input.nextLine();

        int isLeapYear = 0;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = 1;
        }

        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul")
                || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
            System.out.println(month + " " + year + " has 31 days");
        } else if (month.equals("Feb")) {
            if (isLeapYear == 1) {
                System.out.println(month + " " + year + " has 29 days");
            } else {
                System.out.println(month + " " + year + " has 28 days");
            }
        } else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")) {
            System.out.println(month + " " + year + " has 30 days");
        } else {
            System.out.println(month + " is not a correct month name");
        }
    }
}
