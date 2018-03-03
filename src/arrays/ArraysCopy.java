package arrays;

import java.util.Arrays;

/**
 * Created by ${fk}
 * on 21:32 2018/3/1
 */
public class ArraysCopy {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 32, 454, 254, 1221, 2, 43};
        ArraysCopy.copy(arr1);
    }

    /**
     * 数组的复制,将一个数组的值拷贝到另一个数组
     *
     * @param arr
     */
    public static void copy(int[] arr) {
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}
