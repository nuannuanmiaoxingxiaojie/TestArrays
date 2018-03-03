package arrays;

/**
 * Created by ${fk}
 * on 11:41 2018/3/3
 */
public class DoubleArray2 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{2, 3, 4}, {4, 6, 8}};
        int[][] arr2 = new int[][]{{1, 5, 2, 8}, {5, 9, 10, -3}, {2, 7, -5, -18}};
        //2次循环,行数2行
        for (int i = 0; i < arr1.length; i++) {
            //每行输出4个元素  4列
            for (int j = 0; j < arr2[0].length; j++) {
                int num = 0;
                //累加3次
                for (int k = 0; k < arr2.length; k++) {
                    num += arr1[i][k] * arr2[k][j];
                    // 第一次a[0][0]*b[0][0]
                    // 第二次a[0][1]*b[1][0]
                    // 第三次a[0][2]*b[2][0]
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
