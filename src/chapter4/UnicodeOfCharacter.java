package chapter4;

/*习题 4.9*/
import java.util.Scanner;

public class UnicodeOfCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);

        System.out.println("The Unicode for the character " + ch + " is " + (int)ch);
    }
}
