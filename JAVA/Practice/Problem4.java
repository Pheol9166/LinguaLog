package Practice;

/*
 * 문자열을 입력받았을 때 공백을 제외한 글자 수만을 리턴하는 코드 작성
 */

public class Problem4 {
    static int getCharCount(String s) {
        return s.replace(" ", "").length();
    }

    public static void main(String[] args) {
        String s = "Hello world, nice to meet you!";
        System.out.printf("공백 포함 글자수: %d\n", s.length());
        System.out.printf("공백 제거 글자수: %d\n", getCharCount(s));
    }
}
