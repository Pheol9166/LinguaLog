package Practice;

/*
 * 양의 정수를 입력받고, 입력받은 수의 자릿수를 출력하는 프로그램
 */

public class Problem3 {
    static int getDigitCount(int n) {
        String s = "" + n;
        return s.length();
    }
    public static void main(String[] args) {
        System.out.println(getDigitCount(1023));
    }
}
