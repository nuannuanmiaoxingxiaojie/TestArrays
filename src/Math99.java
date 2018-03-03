/**
 * Created by ${fk}
 * on 16:09 2018/3/3
 */
public class Math99 {
    public static void main(String[] args) {
        int x;
        int y;
        for (x = 0; x <= 9; x++) {
            for (y = 1; y <= x; y++) {
                System.out.print(x + "*" + y + "=" + x * y + " ");
            }
            System.out.println();
        }
    }
}
