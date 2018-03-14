package date;

import java.util.Scanner;

/**
 * Created by ${fk}
 * on 13:19 2018/3/14
 */
public class DateTwo {
    public static void main(String[] args) {
        System.out.println("输入年月入,格式如1997/03/03");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String[] strArr = str.split("/");
        int year = Integer.parseInt(strArr[0]);
        int month = Integer.parseInt(strArr[1]);
        int day = Integer.parseInt(strArr[2]);
        days(year,month,day);
    }

    private static void days(int year,int month,int day) {
        int allDay=0;
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<month-1;i++){
            allDay += days[i];
        }
        allDay+=day;
        if(((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0) ) && month > 2){
            allDay++;
        }
        System.out.println(month+"月"+day+"是"+year+"年的第"+allDay+"天");
    }
}
