package chapter3;
/*习题 3.21 输入年月日，输出周几*/
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();
        if (month == 1 || month == 2) {
            month += 12;
            year -= 1;
        }
        int h = (day + 26 * (month + 1) / 10 + year % 100 +
                 year % 100 / 4 + year / 100 / 4 + 5 * year / 100) % 7;
        String weekday = "";
        switch (h) {
            case 0:
                weekday += "Saturday";
                break;
            case 1:
                weekday += "Sunday";
                break;
            case 2:
                weekday += "Monday";
                break;
            case 3:
                weekday += "Tuesday";
                break;
            case 4:
                weekday += "Wednesday";
                break;
            case 5:
                weekday += "Thursday";
                break;
            default:
                weekday += "Friday";
        }
        System.out.println("Day fo the week is " + weekday);
    }
}
