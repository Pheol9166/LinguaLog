import java.util.HashMap;
import java.util.ArrayList; 

public class Map {
    public static void main(String[] args){
        /*
         * map(associative array | hash)
         * 
         * key와 value를 한 쌍으로 갖는 자료형
        */

        // HashMap
        HashMap<String, String> map = new HashMap<>();
        // put
        map.put("You", "너"); 
        map.put("Me", "나");

        // get
        System.out.println(map.get("You"));
        System.out.println(map.getOrDefault("you", "None")); // null 대신 기본값 지정 가능

        // containsKey: 맵에 해당 키가 있는지 bool로 반환
        System.out.println(map.containsKey("You"));

        // remove
        System.out.println(map.remove("Me")); // 삭제된 후 key에 따른 value값이 출력

        // size: 맵 원소 개수 반환
        System.out.println(map.size());

        // keySet: 모든 key 리턴
        System.out.println(map.keySet());

        ArrayList<String> keyList = new ArrayList<>(map.keySet()); // 이렇게 별도의 ArrayList로 만들 수도 있음
        System.out.println(keyList);

        /*
         * LinkedHashMap, TreeMap
         * 
         * LinkedHashMap: 입력된 순서대로 데이터 저장
         * 
         * TreeMap: 입력된 key의 오름차순대로 데이터 저장
         */
    }
}
