package chapter5;
/*习题5.26*/
import java.math.BigDecimal;
import java.math.BigInteger;

public class ComputeE {
    public static void main(String[] args) {
        BigDecimal e = new BigDecimal(1);
//        BigInteger n = new BigInteger(new Long(1));
        BigDecimal n = new BigDecimal(1);
        for (int i = 1; i <= 100; i++) {
//            n *= i;
            n = n.multiply(new BigDecimal(i));
//            e += 1.0/n;
            e = e.add(new BigDecimal(1).divide(n, 26, BigDecimal.ROUND_HALF_UP));
            System.out.println("the " + i + " round : " + n);
            System.out.println("the " + i + " round : " + e);
            /*if (i % 10000 == 0) {
                System.out.printf("the " + i + " round : %.6f\n", e);
            }*/
        }
    }
}
