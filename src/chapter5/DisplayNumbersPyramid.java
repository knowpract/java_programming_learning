package chapter5;
/*习题 5.19*/
public class DisplayNumbersPyramid {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 7 - i; j > 0; j--) {
                System.out.print("      ");
            }
            for (int t = 0; t <= i; t++) {
                System.out.printf("%6d", (int)Math.pow(3, t));
            }
            for (int k = 0; k < i; k++) {
                System.out.printf("%6d", (int)Math.pow(3, i-k-1));
            }
            System.out.println();
        }
    }
}
