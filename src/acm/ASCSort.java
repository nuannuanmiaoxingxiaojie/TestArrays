package acm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ${fk}
 * on 19:32 2018/3/19
 */
public class ASCSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char a = str.charAt(0);
        char b = str.charAt(1);
        char c = str.charAt(2);
        MySort(a, b, c);
//        String str1 = scanner.next();
//        String[] str2 = str1.split(" ");
//        Arrays.sort(str2);
//        for (String t : str2) {
//            System.out.println(t);
//        }
    }

    private static void MySort(char a, char b, char c) {
        char a1 = a;
        char b1 = b;
        char c1 = c;
        if (a1 < b1 && b1 < c1) {
            System.out.println(a1 + " " + b1 + " " + c1);
        }
        if (a1 < c1 && c1 < b1) {
            System.out.println(a1 + " " + c1 + " " + b1);
        }
        if (b1 < c1 && c1 < a1) {
            System.out.println(b1 + " " + c1 + " " + a1);
        }
        if (b1 < a1 && a1 < c1) {
            System.out.println(b1 + " " + a1 + " " + c1);
        }
        if (c1 < a1 && a1 < b1) {
            System.out.println(c1 + " " + a1 + " " + b1);
        }
        if (c1 < b1 && b1 < a1) {
            System.out.println(c1 + " " + b1 + " " + a1);
        }
    }
}
