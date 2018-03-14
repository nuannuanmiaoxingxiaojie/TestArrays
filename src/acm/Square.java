package acm;

import java.util.Scanner;

/**
 * Created by ${fk}
 * on 15:57 2018/3/14
 * 根据输入的半径值，计算球的体积
 */
public class Square {
    public static void main(String[] args) {
        System.out.println("请输入半径");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        float f = (float) (4/3 * Math.PI*a*a*a);
        System.out.println(f);
    }
}
