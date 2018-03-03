package arrays;


/**
 * Created by ${fk}
 * on 13:09 2018/3/3
 * 计算出数组中的平均值、最大值、最小值
 */
public class ArraysSum {
    public static void main(String[] args) {
        int[] arr = new int[]{-10, 2, 3, 246, -100, 0, 5};
        sort(arr);
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
