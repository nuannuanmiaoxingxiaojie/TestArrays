package acm;

import java.util.Scanner;

/**
 * Created by ${fk}
 * on 22:34 2018/3/15
 */
public class FlowerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        for (i = a; i <= b; i++) {
            x = i % 10;
            y = i / 10 % 10;
            z = i / 10 / 10 % 10;
            if (i == (x * x * x) + (y * y * y) + (z * z * z)){
                System.out.println(i);
            }
        }

    }
}
