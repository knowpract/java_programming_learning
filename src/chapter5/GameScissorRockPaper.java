package chapter5;

import java.util.Scanner;
/*习题 5.34*/
public class GameScissorRockPaper {
    public static void main(String[] args) {
        int i = 0;
        String[] gameInfo = new String[3];
        gameInfo[0] = "scissor";
        gameInfo[1] = "rock";
        gameInfo[2] = "paper";
        while (Math.abs(i) <= 3) {
            System.out.println("============= Another round : ");
            int computerNumber = (int) (Math.random() * 3);
            Scanner input = new Scanner(System.in);
            System.out.print("scissor (0), rock (1), paper (2): ");
            int myNumber = input.nextInt();
            if (computerNumber == myNumber) {
                System.out.println("The computer is " + gameInfo[computerNumber] + ". You are "
                        + gameInfo[myNumber] + " too. It is a draw");
            }
            else if (Math.abs(computerNumber - myNumber) == 1) {
                if (computerNumber > myNumber) {
                    System.out.println("The computer is " + gameInfo[computerNumber] + ". You are "
                            + gameInfo[myNumber] + ". The computer won");
                    i++;
                } else {
                    System.out.println("The computer is " + gameInfo[computerNumber] + ". You are "
                            + gameInfo[myNumber] + ". You won");
                    i--;
                }
            } else if (Math.abs(computerNumber - myNumber) == 2) {
                if ((3 - computerNumber) > (3 - myNumber)) {
                    System.out.println("The computer is " + gameInfo[computerNumber] + ". You are "
                            + gameInfo[myNumber] + ". The computer won");
                    i++;
                } else {
                    System.out.println("The computer is " + gameInfo[computerNumber] + ". You are "
                            + gameInfo[myNumber] + ". You won");
                    i--;
                }
            }
        }
        if (i >= 3) {
            System.out.println("Game End : " + "The computer won !");
        } else {
            System.out.println("Game End : " + "You won !");
        }
    }
}
