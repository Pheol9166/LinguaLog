package Advance;

/*
 * 접근 제어자(access modifier)
 * 
 * - private: 해당 클래스 안에서만 접근이 가능
 * - default: 별도 설정을 안 했을 때의 경우. 동일한 패키지 안에서만 접근이 가능
 * - protected: 동일 패키지의 클래스 또는 해당 클래스를 상속받은 클래스에서만 접근 가능
 * - public: public 접근 제어자가 붙은 변수나 메서드는 어떤 클래스에서도 접근 가능 
 */

/*
 * static
 * 
 * static이 붙으면 메모리 할당을 딱 한 번만 하게 되어 썼던 값을 그대로 쓸 수 있음
 * => 값을 공유할 수 있음
 * 메모리 효율보단 값 공유의 의미로 많이 씀
 */
class HouseKim {
    static String lastname = "Kim";
}

class Counter {
    static int count = 0;
    Counter() {
        count++;
        System.out.println(count);
    }

    public static int getCount() {
        return count;
    }
}

public class Access {

    // Access 클래스에서 밖에 접근 못함
    private String secret;
    private String getSecret() {return this.secret;}
    public static void main(String[] args) {
        HouseKim kim1 = new HouseKim();

        Counter c1 = new Counter();
        Counter c2 = new Counter(); // static이라 값이 증가함
    
        System.out.println(Counter.getCount()); // static method라 클래스로 호출
        
        /*
         * static method
         * 
         * 유틸리티성 메서드를 작성시 많이 사용됨
         * 
         * cf) 유틸리티성 메서드: 재사용 가능하고 범용 기능을 제공하는 메서드들
         */
    }
}
