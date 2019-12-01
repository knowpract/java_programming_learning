package chapter5;

/*习题 5.25*/
public class ComputePai {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 100000; i++) {
            sum += 4 * Math.pow(-1, i+1) / (2 * i - 1);
            if (i % 10000 == 0) {
                System.out.printf("the " + i + " round : %.6f\n", sum);
            }
        }
    }
}
