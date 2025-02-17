import java.util.Arrays;

public class Variable {
    public static void main(String[] args){
        /*
         * 원시 자료형
         * : int, long, double, float, boolean, char
         * 
         * cf) 이들을 Wrapping 해주는 Wrapper 클래스도 있음 ex) Integer
         */

        int a;
        String b;

        a = 1;
        b = "hello java";
        System.out.println(a);
        System.out.println(b);
        System.out.println("---------------");

        // 숫자 자료형
        /*
         * 정수
         * - int
         * - long
         * 
         * 실수
         * - float
         * - double
         */
        int i = 0;
        int j = 10;
        float k = 0.3F;
        System.out.println("---------------");

        // 연산
        i++;
        j--;
        System.out.println(i + j);
        System.out.println(j * i);
        System.out.println(--i);
        System.out.println(i++);
        System.out.println(k * 3);
        System.out.println(0.1F + 0.2F);
        System.out.println("---------------");

        // boolean
        boolean isOdd = i % 2 == 1;
        System.out.println(isOdd);
        System.out.println("---------------");

        // 문자형
        // char
        char a1 = 'a';
        char a2 = 97;
        char a3 = '\u0061';

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("---------------");
        // String
        String s1 = "Happy Home"; // 리터럴 방식
        String s2 = new String("a"); // String 객체를 만듬

        System.out.println(s1);
        System.out.println(s2);

        // 내장 메서드

        System.out.println(s1.equals(s2)); // 비교 메서드. equals 대신 == 쓰면 큰일남
        System.out.println(s1.indexOf("Home")); // 특정 문자열이 시작되는 인덱스값 리턴
        System.out.println(s1.contains("Home")); // 특정 문자열 포함 검사
        System.out.println(s1.charAt(6)); // 특정 인덱스에 있는 char 반환
        System.out.println(s1.replaceAll("Home", "JAVA")); // 문자열 교체
        System.out.println(s1.substring(0, 4)); // 문자열 slicing
        System.out.println(s1.toUpperCase()); // capitalize
        
        String[] result = s1.split(" "); // 문자열 split
        System.out.println(Arrays.toString(result));

        System.out.println(String.format("I hate %d things", 7)); // formatting
        // %를 문자로 쓰고 싶으면 %%로 써야함
    
        System.out.println(String.format("%-10sjane", "hi")); // 공백 표현과 정렬

        System.out.println(String.format("%.4f", 3.141592)); // 소수점 n째 자리까지 나타냄

        System.out.printf("%-20s jude", "what is wrong,"); // printf: 포매팅된 문자열 출력 가능
        
        /*
         * StringBuffer
         * 문자열 추가 혹은 변경 시 사용하는 자료형
         */

         StringBuffer sb = new StringBuffer(); // 객체 생성
         sb.append("hello");
         sb.append(" java");
         String result2 = sb.toString(); // 문자열 환원
         System.out.println(result2);
 
         String result3 = "";
         result2 += "hello";
         result2 += " java"; // + 연산을 할 때마다 새로운 String 객체 생성
         System.out.println(result3);
 
         /*
          * String은 immutable하기 때문에 바뀔 수 없음
          * 때문에 mutable한 StringBuffer를 사용함
          * 대신 StringBuffer가 더 무거움
          */
 
         /*
          * cf) StringBuilder
          * StringBuffer: 멀티스레드에서 안전
          * StringBuilder: 성능 우수
          */
 
         // method
         StringBuffer sb2 = new StringBuffer();
         sb2.append("jump to java");
         sb2.insert(0, "Welcome to ");
         System.out.println(sb2);
         System.out.println(sb2.substring(0, 10));    
    }
}
