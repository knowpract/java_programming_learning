package chapter1;
/* 习题1.4 */
public class PrintaTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            if (i == 1) {
                System.out.print("a\t");
            }
            else if (i == 4) {
                System.out.println("a^" + i);
            }
            else {
                System.out.print("a^" + i + "\t");
            }
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j != 4) {
                    System.out.print((int)Math.pow(i, j) + "\t");
                }
                else {
                    System.out.println((int)Math.pow(i, j));
                }
            }
        }
    }
}
