/**
 * Created by ${fk}
 * on 21:11 2018/3/3
 */
public class Rabbit {
    public static void main(String[] args) {
        int rabbitNum = 1;
        for (int i = 1; i < 24; i++) {
            rabbitNum = getNum(i);
            System.out.println("兔子第 " + i + " 个月的总数为" + rabbitNum);
        }
    }

    private static int getNum(int i) {
        int initRabbit = 1;
        if (i == 1 || i == 2) {
            return initRabbit;
        }
        initRabbit = getNum(i - 1) + getNum(i - 2);
        return initRabbit;
    }
}
