class Updater {
    void update(int count) {
        count++;
    }
}

class Updater2 {
    void update(Counter counter) {
        counter.count++;
    }
}

class Counter {
    int count = 0; // property
}

public class Count {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(String.format("before update: %d", counter.count));
        Updater updater = new Updater();
        updater.update(counter.count);
        System.out.println(String.format("after update: %d", counter.count));
        // => counter의 count가 증가되지 않음. why?

        Updater2 updater2 = new Updater2();
        updater2.update(counter);
        System.out.println(String.format("Updater2 update: %d", counter.count));    // 결과: 1
        /*
         * - 기본 자료형 같은 값에 의한 참조들은 실제 값 자체를 저장.
         * -> 값을 복사해서 넘겨줌
         * 
         * - 객체 기반 참조는 주소값을 포함하기에 주소값을 넘겨줌
         * -> 주소값으로 접근해서 바꾸면 객체에서도 바뀜
         */
    }
}
