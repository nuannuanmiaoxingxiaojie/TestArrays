/**
 * Created by ${fk}
 * on 14:07 2018/3/3
 */
public class YHTriangle {
    public static void main(String[] args) {
        //声明二维数组
        int[][] arr = new int[10][];
        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            //打印空格
            for (int m = 0; m < arr.length - 1 - i; m++) {
                System.out.print("  ");
            }
            //给每个二维数据的元素赋值一维数组
            arr[i] = new int[i + 1];
            //遍历一维数组
            for (int j = 0; j < arr[i].length; j++) {
                //第一个元素和最后一个元素的值都是1
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    //当前一维数组的索引n元素的值，等于前一个数组索引n-1，加上索引n的值
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                //格式化输出元素值
                System.out.printf("%4d", arr[i][j]);
            }
            //换行
            System.out.println();
        }
    }
}
