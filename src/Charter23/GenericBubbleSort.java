package Charter23;
/*习题23.1*/
import java.util.Comparator;

public class GenericBubbleSort {
    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i].compareTo(list[i+1]) > 0) {
                    E temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (comparator.compare(list[i], list[i+1]) > 0) {
                    E temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println();
        System.out.println("===============");

        Integer[] list2 = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list2, (e1, e2) -> e1 > e2 ? 1 : -1);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list2[i] + " ");
        }
    }
}
