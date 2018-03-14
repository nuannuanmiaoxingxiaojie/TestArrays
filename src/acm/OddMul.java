package acm;

import java.util.Scanner;

/**
 * Created by ${fk}
 * on 17:38 2018/3/14
 * 给你n个整数，求他们中所有奇数的乘积。
 */
public class OddMul {
    public static void main(String[] args) {
        System.out.println("输入一组数据,格式如 3 4 5 6 23");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int s = 1;
        for (int i = 1; i <= a; i++) {
            int m = scanner.nextInt();
            if (m % 2 != 0) {
                s = s * m;
            }
        }
        System.out.println(s);
    }
}
