package acm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ${fk}
 * on 15:33 2018/3/14
 * 输入三个字符后，按各字符的ASCII码从小到大的顺序输出这三个字符。
 */
public class AsciiSort {
    public static void main(String[] args) {
        System.out.println("输入三个字符,如a,b,c");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] strArr = str.split(",");
        Arrays.sort(strArr);
        for(String s: strArr){
            System.out.print(s+" ");
        }
    }
}
