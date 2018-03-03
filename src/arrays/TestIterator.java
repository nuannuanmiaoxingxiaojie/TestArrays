package arrays;

/**
 * Created by ${fk}
 * on 17:52 2018/3/2
 * 数组遍历、数组元素访问(找数组中的最大值及其索引)
 */
public class TestIterator {
    public static void main(String[] args) {
        int[] arr = new int[]{18, 25, 7, 89, 13, 2, 32, 6};
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
