package acm;

import java.util.Scanner;

/**
 * Created by ${fk}
 * on 20:56 2018/3/14
 * 给定一段连续的整数，求出他们中所有偶数的平方和以及所有奇数的立方和
 */
public class IntTest {
    public static void main(String[] args) {
        System.out.println("输入需要给定的连续整数");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp =a;
        int square = 0;
        int cube = 0;
        for (int i = 0; i <= b - a; i++) {
            if (i % 2 == 0) {
                square += (temp * temp);
                ++temp;
            } else {
                cube += (temp * temp * temp);
                ++temp;
            }

        }
        System.out.println(square + " " + cube);


    }
}
