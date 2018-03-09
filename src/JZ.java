import java.util.Scanner;

/**
 * Created by ${fk}
 * on 13:16 2018/3/5
 */
public class JZ {
    public static void main(String[] args) {
        System.out.println("请输入n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printJZ(n);
    }

    private static void printJZ(int n) {
        int[][] arr = new int[n][n];
        int i = 0;
        int j = 0;
        int t = 1;
        for (int k = 0; k < n / 2; k++) {
            for (i = k, j = k; j < n - k - 1; j++) {
                arr[i][j] = t++;
            }
            for (i = k, j = n - k - 1; i < n - k - 1; i++) {
                arr[i][j] = t++;
            }
            for (i = n - k - 1, j = n - k - 1; j > k; j--) {
                arr[i][j] = t++;
            }
            for (i = n - k - 1, j = k; i > k; i--) {
                arr[i][j] = t++;
            }
        }
        if (n % 2 == 1) {
            arr[n / 2][n / 2] = t;
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
