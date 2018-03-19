package sort;

/**
 * Created by ${fk}
 * on 14:14 2018/3/2
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 33, 45, 25, 3, 10};
        int tmp;
        /**
         * 外层循环控制排序趟数（length-1）
         */
        for (int i = 0; i < arr.length - 1; i++) {
            /**
             * 内层循环控制每一趟排序多少次
             */
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
