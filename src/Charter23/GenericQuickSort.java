package Charter23;
/*习题 23.3 快速排序的泛型版本实现*/
import java.util.Comparator;

public class GenericQuickSort {
    public static <E extends Comparable<E>> void quickSort(E[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static <E extends Comparable<E>> void quickSort(E[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, 0, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    private static <E extends Comparable<E>> int partition(E[] list, int first, int last){
        E pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {
            while (low <= high && list[low].compareTo(pivot) <= 0) {
                low++;
            }

            while (low <= high && list[high].compareTo(pivot) > 0) {
                high--;
            }

            if (high > low) {
                E temp = list[low];
                list[low] = list[high];
                list[high] = temp;
            }
        }

        while (high > first && list[high].compareTo(pivot) >= 0) {
            high--;
        }

        if (pivot.compareTo(list[high]) > 0) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }

    public static <E> void quickSort(E[] list, Comparator<? super E> comparator) {
        quickSort(list, 0, list.length - 1, comparator);
    }

    private static <E> void quickSort(E[] list, int first, int last, Comparator<? super E> comparator) {
        if (first < last) {
            int pivotIndex = partition(list, first, last, comparator);
            quickSort(list, 0, pivotIndex - 1, comparator);
            quickSort(list, pivotIndex + 1, last, comparator);
        }
    }

    private static <E> int partition(E[] list, int first, int last, Comparator<? super E> comparator) {
        E pivot = list[first];
        int low = first + 1;
        int high = last;

        while (low < high) {
            while (low <= high && comparator.compare(list[low], pivot) <= 0) {
                low++;
            }

            while (low <= high && comparator.compare(list[high], pivot) > 0) {
                high--;
            }

            if (low < high) {
                E temp = list[low];
                list[low] = list[high];
                list[high] = temp;
            }
        }

        while (high > first && comparator.compare(list[high], pivot) >= 0) {
            high--;
        }

        if (comparator.compare(pivot, list[high]) > 0) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }

    public static void main(String[] args) {
        Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        quickSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("====");

        Integer[] list2 = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        quickSort(list2, (e1, e2) -> e1 < e2 ? 1 : -1);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list2[i] + " ");
        }
    }
}
