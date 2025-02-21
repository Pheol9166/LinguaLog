/*
 * Interface
 * 서로 다른 두 개의 시스템, 장치 사이에서 정보 또는 신호를 주고받는 접점
 * 
 * 클래스가 반드시 가져야하는 메소드를 정의해줌
 * -> 인터페이스를 상속받은 클래스가 어떤 역할을 하는지 알 수 있음
*/

/*
 * 다형성
 * 하나의 객체가 여러 개의 자료형 타입을 가질 수 있는 것.
 * ex) Tiger가 Barkable과 Predator를 동시에 가지는 것
 * 복잡한 형태의 분기문을 간단하게 처리할 수 있는 장점이 있음
 */
interface Predator {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
}

interface Barkable {
    void bark();
}

// 인터페이스는 다중상속 됨
interface BarkablePredator extends Predator, Barkable {
}

class Animal {
    String name;
}

/*
 * 추상 클래스
 * 인터페이스와 클래스의 역할을 모두 함
 * 
 */
abstract class absPredator extends Animal {
    abstract String getFood();  // abstract 걸려있는건 구현해야함
    
    void printFood() {
        System.out.printf("my food is %s", getFood());
    }
}

class Tiger extends Animal implements Predator, Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Animal implements BarkablePredator{
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("크릉릉");
    }
}

class Crocodile extends absPredator implements Barkable {
    public String getFood() {
        return "melon";
    }
    
    public void bark() {
        System.out.println("크앙");
    }
}

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }

    void feed(absPredator predator) {
        System.out.println("feed " + predator.getFood());
    }

    void barkAnimal(Barkable barkable) {
        barkable.bark();
    }
}

public class Interface {
    public static void main(String[] args) {
        ZooKeeper keeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Crocodile crocodile = new Crocodile();

        keeper.feed(tiger);
        keeper.barkAnimal(lion); // Barkable로 매개변수를 설정해도 자식 인터페이스라 정상적으로 출력됨
        keeper.feed(crocodile);
    }
}