package arrays;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ${fk}
 * on 18:01 2018/3/2
 * 将数组的元素逆序存放
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5,6};
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("-------------------------------");
        String str = Arrays.toString(arr);
        String str2 = str.substring(0, str.length() - 1);
        System.out.println(str2 + " ");
    }

    private static void reverseArray(int[] arr) {
        int a = 0;
        int b = arr.length - 1;
        while (b > 2 * a) {
            int x = arr[a];
            arr[a] = arr[b - a];
            arr[b - a] = x;
            a++;
        }
    }
}
