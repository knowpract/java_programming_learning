package chapter5;

/*习题 5.17*/
import java.util.Scanner;

public class DisplayPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();

        for (; number >= 1; number--) {
            for (int i = number; i >= 1; i --) {
                System.out.print(i + " ");
            }
            for (int j = 2; j <= number; j ++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
