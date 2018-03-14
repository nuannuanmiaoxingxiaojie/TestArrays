package acm;

import java.util.Scanner;

/**
 * Created by ${fk}
 * on 16:03 2018/3/14
 * 求实数的绝对值。
 */
public class Abs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int c = scanner.nextInt();
            int a = Math.abs(c);
            System.out.println(a);
        }
    }
}
