package Advance;

/*
 * 싱글톤 패턴
 * : 단 하나의 객체만을 생성하게 강제하는 디자인 패턴
 * 
 * 클래스를 통해 생성할 수 있는 객체가 하나만 되도록.
 */

 // static 변수와 static method를 통해서 싱글톤 패턴을 구현할 수 있다.
class Example {
    // 생성자의 private를 넣기만 하면 객체 생성 시 오류 발생
    private static Example one;
    private Example() {
    }

    public static Example getInstance() {
        if (one == null) {
            one = new Example();
        }
        return one;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Example singleton1 = Example.getInstance();
        Example singleton2 = Example.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);   // true
    }
}
