package acm;

/**
 * Created by ${fk}
 * on 9:56 2018/3/16
 * 求2个字符串最长的公共子串
 */
public class MaxLengthTest {
    public static void main(String[] args) {
        String strOne = "abcdefg";
        String strTwo = "abcdegwgeweg";
        String result = MaxLengthTest.maxSubstring(strOne, strTwo);
        System.out.println(result);
    }

    private static String maxSubstring(String strOne, String strTwo) {
        String max = " ";
        String min = " ";
        if (strOne.length() < strTwo.length()) {
            max = strTwo;
            min = strOne;
        } else {
            max = strOne;
            min = strTwo;
        }
        String current = " ";
        for (int i = 1; i < min.length(); i++) {
            for (int begin = 0, end = min.length() - i; end <= min.length(); begin++, end++) {
                current = min.substring(begin, end);
                if (max.contains(current)) {
                    return current;
                }
            }
        }
        return null;
    }
}
