package chapter5;
/*习题 5.7*/
public class FinancialApplication {
    public static void main(String[] args) {
        double tuition = 10000;
        for (int i = 0; i < 10; i++) {
            tuition *= 1.06;
        }
        System.out.printf("In ten years, the tuition is: %.2f\n", tuition);

        double sumTuition = 0;
        for (int i = 0; i < 4; i++) {
            sumTuition += tuition * Math.pow(1.06, i);
        }
        System.out.printf("the total cost of four years' worth of tuition after the tenth year: %.2f\n", sumTuition);
    }
}
