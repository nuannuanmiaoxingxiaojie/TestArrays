package arrays;

/**
 * Created by ${fk}
 * on 12:45 2018/3/3
 * 将一个数组中的重复元素保留一个其他的清零
 */
public class RepeatArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 2, 5,};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
