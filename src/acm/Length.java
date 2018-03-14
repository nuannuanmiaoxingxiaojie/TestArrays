package acm;

import java.util.Scanner;

/**
 * Created by ${fk}
 * on 15:47 2018/3/14
 * 输入两点坐标（X1,Y1）,（X2,Y2）,计算并输出两点间的距离。
 */
public class Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个坐标");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("请输入第二个坐标");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        double a = Math.sqrt(Math.abs((x1-x1)*(x1-x2))+Math.abs((y1-y2)*(y1-y2)));
        System.out.println(a);
    }
}
