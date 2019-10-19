package chapter3;

/*习题 3.15 随机生成一个三位数的数字，猜这个数字是哪个*/
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 1000);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery / 10) % 10;
        int lotteryDigit3 = lottery % 10;

        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess / 10) % 10;
        int guessDigit3 = guess % 10;

        int[] labels = new int[3];
        while (true) {
            if (guessDigit1 == lotteryDigit1) {
                labels[0] = 1;
                break;
            }
            if (guessDigit1 == lotteryDigit2) {
                labels[1] = 1;
                break;
            }
            if (guessDigit1 == lotteryDigit3) {
                labels[2] = 1;
                break;
            }
            break;
        }

        while (true) {
            if (guessDigit2 == lotteryDigit1 && labels[0] == 0) {
                labels[0] = 1;
                break;
            }
            if (guessDigit2 == lotteryDigit2 && labels[1] == 0) {
                labels[1] = 1;
                break;
            }
            if (guessDigit2 == lotteryDigit3 && labels[2] == 0) {
                labels[2] = 1;
                break;
            }
            break;
        }

        while (true) {
            if (guessDigit3 == lotteryDigit1 && labels[0] == 0) {
                labels[0] = 1;
                break;
            }
            if (guessDigit3 == lotteryDigit2 && labels[1] == 0) {
                labels[1] = 1;
                break;
            }
            if (guessDigit3 == lotteryDigit3 && labels[2] == 0) {
                labels[2] = 1;
                break;
            }
            break;
        }

        if (lottery == guess) {
            System.out.println("Exact match: you win $12,000");
        } else if (labels[0] + labels[1] + labels[2] == 3) {
            System.out.println("Match all digits: you win $5,000");
        } else if ((labels[0] + labels[1] + labels[2] == 1) || (labels[0] + labels[1] + labels[2] == 2)) {
            System.out.println("Match one digit: you win $2,000");
        } else {
            System.out.println("Sorry, no match");
        }
        System.out.println("The lottery number is: " + lottery);
    }
}
