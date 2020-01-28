package Charter23;
/*冒泡排序：进行 n-1 次遍历。每次遍历，比较 i 与 i+1 元素，若 list[i] > list[i+1]，交换两者的值*/
public class BubbleSort {
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for(int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for(int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i+1]) {
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
