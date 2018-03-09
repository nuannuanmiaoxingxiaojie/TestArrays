import java.util.Scanner;

/**
 * Created by ${fk}
 * on 13:04 2018/3/5
 */
public class HuiSquare {
    public static void main(String[] args) {
        System.out.println("请输入n ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printJZ(n);
    }

    public static void printJZ(int n) {
        int[][] A = new int[n][n];
        int t = 1;
        int i = 0;
        int j = 0;
        for (int k = 0; k < n / 2; k++) {//k代表第几圈
            for (i = k, j = k; j < n - k - 1; j++) {//第一条边
                A[i][j] = t++;
            }
            for (i = k, j = n - k - 1; i < n - k - 1; i++) {//第二条边
                A[i][j] = t++;
            }
            for (i = n - k - 1, j = n - k - 1; j > k; j--) {//第三条边
                A[i][j] = t++;
            }
            for (i = n - k - 1, j = k; i > k; i--) {//第四条边
                A[i][j] = t++;
            }
        }
        if (n % 2 == 1) {
            A[n / 2][n / 2] = t;
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

}
