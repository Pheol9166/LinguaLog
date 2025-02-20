class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class CuteAnimal extends Animal {
    // 기본 생성자(default constructor)
    CuteAnimal() {
    }

    void cute_face() {
        System.out.println(this.name + " cuty face~!");
    }
}

class VeryCuteAnimal extends CuteAnimal {
    // 생성자 -> 객체 생성 시 호출되어 여러 처리가 가능
    VeryCuteAnimal(String name) {
        this.setName(name);
    }

    // constructor overloading
    VeryCuteAnimal(int type) {
        if (type == 1) {
            this.setName("dog");
        } else if (type == 2) {
            this.setName("cat");
        }
    }

    void cute_face() {
        System.out.println(this.name + " is very cute!!");
    }

    void cute_face(int sec) {
        System.out.println(this.name + " is very cute! for " + sec + " seconds!");
    }
}


// 생성자
public class Construct {
    public static void main(String[] args){
        VeryCuteAnimal dog = new VeryCuteAnimal(1);
        System.out.println(dog.name);
    }
}
