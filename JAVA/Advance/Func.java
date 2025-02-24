package Advance;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 함수형 프로그래밍
 * 
 * - lambda
 * - stream
 */


@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
    // 인터페이스의 메서드가 1개 이상이면 lambda를 사용할 수 없음
}

// 객체 지향형 프로그래밍(OOP) 사용 시
class MyCalculator implements Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
}

public class Func {
    public static void main(String[] args) {
        // lambda 
        MyCalculator c = new MyCalculator();
        int result = c.sum(3, 4);
        System.out.println(result);

        Calculator mc = (int a, int b) -> a + b; // lambda 코드
        Calculator mc2 = (a, b) -> a + b;   // 타입이 정해져 있음으로 생략 가능
        Calculator mc3 = Integer::sum;  //  Integer의 sum 메소드를 사용하여 더욱 축약 가능 (::는 어떤 클래스의 메소드를 사용할 때 씀) 
        int result2 = mc.sum(3, 4);
        System.out.println(result2);

        /*
         * stream
         * 
         * 필터링을 통해 여러 번 변경되어 반환
         * 간결하고 가독성이 좋음
         */
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        // 짝수만 뽑아 중복 제거 후 역순 정렬하는 프로그램을 만들때

        int[] result3 = Arrays.stream(data)  // IntStream 생성
            .boxed()    // IntStream을 Stream<Integer>로 변경
            .filter((a) -> a % 2 == 0)  // 짝수만 추출
            .distinct() // 중복 제거
            .sorted(Comparator.reverseOrder())  // 역순으로 정렬
            .mapToInt(Integer::intValue)// Stream<Integer>를 IntStream으로 변경
            .toArray()
            ;
        
        System.out.println(Arrays.toString(result3));

    }
    
}
