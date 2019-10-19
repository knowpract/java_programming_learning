package chapter3;
/*习题 3.17 石头剪刀布游戏*/
import java.util.Scanner;

public class ScissorRockPaper {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random() * 3);
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int myNumber = input.nextInt();
        String[] gameInfo = new String[3];
        gameInfo[0] = "scissor";
        gameInfo[1] = "rock";
        gameInfo[2] = "paper";
        if (computerNumber == myNumber) {
            System.out.println("The computer is " + gameInfo[computerNumber] + ". You are "
            + gameInfo[myNumber] + " too. It is a draw");
        }
        else if (Math.abs(computerNumber - myNumber) == 1) {
            if (computerNumber > myNumber) {
                System.out.println("The computer is " + gameInfo[computerNumber] + ". You are "
                        + gameInfo[myNumber] + ". The computer won");
            } else {
                System.out.println("The computer is " + gameInfo[computerNumber] + ". You are "
                        + gameInfo[myNumber] + ". You won");
            }
        } else if (Math.abs(computerNumber - myNumber) == 2) {
            if ((3 - computerNumber) > (3 - myNumber)) {
                System.out.println("The computer is " + gameInfo[computerNumber] + ". You are "
                        + gameInfo[myNumber] + ". The computer won");
            } else {
                System.out.println("The computer is " + gameInfo[computerNumber] + ". You are "
                        + gameInfo[myNumber] + ". You won");
            }
        }
    }
}
