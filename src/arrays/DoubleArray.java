package arrays;

/**
 * Created by ${fk}
 * on 16:04 2018/3/2
 * 数组定义和创建、多维数组初始化、数组遍历(二维数组)
 */
public class DoubleArray {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{1, 2, 3}, {3, 2, 1}, {4, 5, 6}, {6, 5, 4}, {7, 8, 9}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
}
