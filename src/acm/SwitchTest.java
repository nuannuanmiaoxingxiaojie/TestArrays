package acm;

import java.util.Scanner;

/**
 * Created by ${fk}
 * on 16:59 2018/3/14
 * 输入一个百分制的成绩t，将其转换成对应的等级，具体转换规则如下：
 90~100为A;
 80~89为B;
 70~79为C;
 60~69为D;
 0~59为E;
 */
public class SwitchTest {
    public static void main(String[] args) {
        System.out.println("请输入成绩");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int a = scanner.nextInt();
            int b = a/10;
            switch (b){
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("B");
                    break;
                case 7:
                    System.out.println("C");
                    break;
                case 6:
                    System.out.println("D");
                    break;
                    default:
                        System.out.println("E");
            }
        }

    }
}
