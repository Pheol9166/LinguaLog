class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

// 상속: IS-A 관계를 충족할 필요가 있음
class CuteAnimal extends Animal {
    void cute_face() {
        System.out.println(this.name + " cuty face~!");
    }
}

class VeryCuteAnimal extends CuteAnimal {
    // method overriding: 상속해서 고쳐쓰기
    void cute_face() {
        System.out.println(this.name + " is very cute!!");
    }

    // method overloading
    void cute_face(int sec) {
        System.out.println(this.name + " is very cute! for " + sec + " seconds!");
    }
}

// 다이아몬드 구조 등의 문제 방지를 위해 다중 상속을 방지
// 파이썬 같은 경우는 우선순위를 정하는 규칙이 있음
public class Inherit {
    public static void main(String[] args) {
        CuteAnimal cat = new CuteAnimal();
        cat.setName("kitty");
        System.out.println(cat.name);   // 상속받았기에 속성과 메소드 모두 사용 가능
        
        VeryCuteAnimal dog = new VeryCuteAnimal();
        dog.setName("poopy");
        dog.cute_face();
        dog.cute_face(2);
    }
}
