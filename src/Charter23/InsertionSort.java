package Charter23;
/*插入排序：将第 i 个元素插入到 0..i-1 元素里*/
public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }
}
