package acm;

import java.util.Scanner;

/**
 * Created by ${fk}
 * on 17:09 2018/3/14
 * 给定一个日期，输出这个日期是该年的第几天
 */
public class DateTest {
    public static void main(String[] args) {
        System.out.println("输入一个日期,如2016/03/03");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] strArr = str.split("/");
        int year = Integer.parseInt(strArr[0]);
        int month = Integer.parseInt(strArr[1]);
        int day = Integer.parseInt(strArr[2]);
        isOdd(year, month, day);
    }

    private static void isOdd(int year, int month, int day) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int allDay = 0;
        for (int i = 0; i < month - 1; i++) {
            allDay += days[i];
        }
        allDay += day;
        if ((year % 400 == 0 && year % 100 != 0) || (year % 4 == 0) && month > 2) {
            allDay++;
        }
        System.out.println(allDay);
    }
}
