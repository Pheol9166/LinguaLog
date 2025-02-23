package Object;

class VoidAnimal {

}

class CuteAnimal {
    String name; // instance variable, property

    // method
    public void setName(String name) {
        this.name = name;   // this: 생성된 객체를 지정
    }

    // 속성 값을 메소드에서 변경하면 계속 유지됨
}


public class Animal {
    public static void main(String[] args) {
        // new -> 객체 생성
        VoidAnimal cat = new VoidAnimal();

        /*
         * 인스턴스: 클래스로 만들어진 객체
         * 주로 특정 객체가 어떤 클래스의 객체인지 관계를 중심으로 설명 시 사용
         */

        CuteAnimal dog = new CuteAnimal();
        System.out.println(dog.name);
        dog.setName("dog");;
        System.out.println(dog.name);
    }
}
