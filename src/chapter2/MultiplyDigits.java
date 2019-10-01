package chapter2;
/*习题 2.6 计算一个 int 整数所有位的乘积*/
import java.util.Scanner;

public class MultiplyDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int multiplication = number % 10;
        int remain = number / 10;
        while (remain != 0) {
            multiplication = multiplication * (remain % 10);
            remain /= 10;
        }
        System.out.println("The multiplication of all digits in " + number + " is " + multiplication);
    }
}
