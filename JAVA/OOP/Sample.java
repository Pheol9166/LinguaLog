class Calculator {
    static int result = 0;

    static int add(int num) {
        return result += num;
    }

    static int sub(int num) {
        return result -= num;
    }
}

public class Sample {
    public static void main(String[] args) {
        System.out.println(Calculator.add(3));
        System.out.println(Calculator.add(4));
    }
}
