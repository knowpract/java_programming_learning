package chapter1;

/*习题1.11 由于人口数不能是小数，计数公式的值采用 int 类型，结果是整数*/
public class PopulationProjection {
    public static void main(String[] args) {
        final int secOfYear = 365 * 24 * 60 * 60;
        int population = 312032486;
        System.out.println("the current population is " + population);
        for (int i = 1; i <= 5; i++) {
            int totalSec = secOfYear * i;
            System.out.println("the population for year " + i + " : " + (population + totalSec / 7 - totalSec / 13 + totalSec / 45));
        }
    }
}
