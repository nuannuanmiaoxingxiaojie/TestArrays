package date;

import java.util.Scanner;

/**
 * Created by ${fk}
 * on 12:58 2018/3/14
 * 输入年月日计算是当年的哪一天
 */
public class Date {
    public static void main(String[] args) {
        int allDay = 0;
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner read = new Scanner(System.in);
        System.out.println("请输入年月日,格式如:1997/01/01");
        String dateStr = read.next();
        String[] dateInt = dateStr.split("/");
        int year = Integer.parseInt(dateInt[0]);
        int month = Integer.parseInt(dateInt[1]);
        int day = Integer.parseInt(dateInt[2]);
        for(int i = 0;i < month-1;i++){
            allDay += days[i];
        }
        allDay +=day;
        if(((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0) ) && month > 2){
            allDay++;
        }
        System.out.println(month+"月"+day+"是"+year+"年的第"+allDay+"天");
    }
}
