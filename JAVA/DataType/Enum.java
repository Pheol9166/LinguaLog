package DataType;
public class Enum {
    enum Language {
        KOREAN,
        ENGLISH,
        JAPANESE
    };
    public static void main(String[] args) {
        /*
         * enum
         * : 연관 있는 여러 개의 상수 집합 정의 시 사용
         */

        System.out.println(Language.KOREAN);   
        System.out.println(Language.ENGLISH);   
        System.out.println(Language.JAPANESE);   
        // 코드의 명확성을 위해 사용. (매직 넘버로 인해 발생하는 오류를 막음)
    }
}
