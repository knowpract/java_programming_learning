package Charter23;
/*习题 23.5 使用比较器的堆排序*/
import java.util.Comparator;

public class GenericHeapSort {
    public static <E extends Comparable<E>> void genericHeapSort(E[] list, Comparator<? super E> comparator) {
        HeapWithComparator heap = new HeapWithComparator(list, comparator);

        for (int i = list.length - 1; i >= 0; i--) {
            list[i]= (E)heap.remove();
        }
    }

    public static void main(String[] args) {
        Integer[] list = { -44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
        GenericHeapSort.genericHeapSort(list, (e1, e2) -> e1 > e2 ? -1 : 1);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
