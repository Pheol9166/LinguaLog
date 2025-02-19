package DataType;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Final {
    public static void main(String[] args) {
        // 형 변환

        // str to int
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);

        // int to str
        n = 123;
        num = "" + n; // 정수 앞에 빈 문자열 더하기
        System.out.println(num);

        String num1 = String.valueOf(n); // int to str
        String num2 = Integer.toString(n); // int to str
        System.out.println(num1);
        System.out.println(num2);

        num = "123.456";
        double d = Double.parseDouble(num);
        System.out.println(d);


        // final
        // 한 번만 설정할 수 있게 강제함

        final int nn = 123;
        // nn = 456; -> 오류

        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        // a = new ArrayList<>(Arrays.asList("c", "d")); -> error



        /*
         * Unmodifiable List
         * 재할당뿐만 아니라 계산도 안되는 경우
         * unmodifiable list로 만듬
         */

        final List<String> ab = List.of("a", "b");
        // ab.add("c") - > error
    }
}
