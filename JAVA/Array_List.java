// import 할 때도 세미 콜론
import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Comparator;

public class Array_List {
    public static void main(String[] args) {    
        // Array
        int[] odds = {1, 3, 5, 7, 9};
        String[] weeks = new String[7]; // 길이 설정도 가능, 초기값이 없을 때는 무조건 길이를 줘야함
        weeks[0] = "월";

        for (int i = 0; i < odds.length; i++) {
            System.out.println(odds[i]);
        }
        System.out.println("--------------");
        
        // List
        /*
         * 배열과 비슷하지만 크기가 고정되어 있지 않음.
         * 
         * ArrayList
         * Vector
         * LinkedList
         */

        ArrayList<String> hey = new ArrayList<>(); // 요즘에는 자료형을 명확하게 표현해줘야함
        hey.add("126");
        hey.add("182");
        hey.add(1, "123");  // add
        System.out.println(hey.get(1)); // get
        System.out.println(hey.size()); // size
        System.out.println(hey.contains("123")); // contains
        System.out.println(hey.remove("123")); // remove, 객체를 입력하면 삭제하고 true를 반환함
        System.out.println(hey.remove(0));  // remove, 인덱스를 주면 해당 항목을 삭제하고 항목을 반환
    
        System.out.println("--------------");
        
        /*
         * Generics
         * 자료형을 안전하게 사용하도록 만들어 주는 기능
         * 
         * ArrayList array = new ArrayList()
         * => generics가 없으면, 객체는 Obect 자료형으로 인식됨
         *    그러면 값을 가져올 때 String 자료형으로 형 변환을 해야 함. 근데 다른 자료형도 같이 들어갈 수 있어서 오류 발생 가능성 높음
         * => 때문에 generics를 적용해서 미연에 방지
         * 
         * ex) ArrayList<String> array = new ArrayList<>()
         */

         String[] data = {"170", "150", "160"};

         ArrayList<String> height = new ArrayList<>(Arrays.asList(data));
         ArrayList<String> height2 = new ArrayList<>(Arrays.asList("150", "180", "160"));
         System.out.println(height);
         System.out.println(height2);


         // String.join
         String results = String.join(",", height);
         System.out.println(results);

         // 정렬
         height.sort(Comparator.naturalOrder()); // 오름차순 정렬
         height.sort(Comparator.reverseOrder()); // 내림차순 정렬
         System.out.println(height);
    }   
}
