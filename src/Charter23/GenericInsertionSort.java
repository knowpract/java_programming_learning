package Charter23;
/*习题 23.6 插入排序的通用版*/
import java.util.Comparator;

public class GenericInsertionSort {
    public static <E extends Comparable<E>> void insertSort(E[] list) {
        for (int i = 1; i < list.length; i++) {
            E currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k].compareTo(currentElement) > 0; k--) {
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }

    public static <E> void insertSort(E[] list, Comparator<? super E> comparator) {
        for (int i = 1; i < list.length; i++) {
            E currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && comparator.compare(list[k], currentElement) > 0; k--) {
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        Integer[] list = { -44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
        GenericInsertionSort.insertSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println();
        System.out.println("=====");

        Integer[] list2 = { -44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
        GenericInsertionSort.insertSort(list2, (e1, e2) -> e1 > e2 ? -1 : 1);
        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i] + " ");
        }
    }
}
