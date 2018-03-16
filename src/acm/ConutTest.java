package acm;

import java.util.Scanner;

/**
 * Created by ${fk}
 * on 22:06 2018/3/15
 */
public class ConutTest {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        System.out.println("输入数字");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            int array = Integer.parseInt(arr[i]);
            if (array > 0) {
                ++a;
            } else if (array == 0) {
                ++b;
            } else {
                ++c;
            }
        }
        System.out.println(a + " " + b + " " + c);
    }
}
