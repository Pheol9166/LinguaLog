import java.util.Arrays;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        /*
         * Set(집합)
         * 
         * - 특징
         *   - 중복 허용 x
         *   - 순서 x
         * 
         * - 종류
         *   - HashSet
         *   - TreeSet
         *   - LinkedHashSet
         */

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6)); // 원시 자료형 int의 wrapper Integer
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5 ,6, 7, 8, 9));

        // 교집합
        HashSet <Integer> intersection = new HashSet<>(s1); // s1을 기준
        intersection.retainAll((s2));
        System.out.println(intersection);

        // 합집합
        HashSet <Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);

        // 차집합
        HashSet <Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2);
        System.out.println(substract);

        System.out.println("--------------");

        // add 
        s1.add(11);
        System.out.println(s1);

        // addAll
        s1.addAll(Arrays.asList(12, 13 ,14)); // 여러 값 추가
        System.out.println(s1);

        // remove
        s1.remove(11);
        System.out.println(s1);

        /*
         * TreeSet, LinkedHashSet
         * 
         * TreeSet: 값을 오름차순 정렬해 저장
         * LinkedHashSet: 값을 입력한 순서대로 정렬
         */
    }
}
