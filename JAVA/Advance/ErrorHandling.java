package Advance;

class IsZeroException extends Exception {
}
public class ErrorHandling {
    public boolean checkZero(int i) throws IsZeroException {
        if (i == 0) {
            throw new IsZeroException();
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        // try catch로 예외처리, finally는 예외와 상관없이 실행되는 구문
        int c = 0;

        // if (c == 0) {
        //     throw new IsZeroException(); 이렇게 던지면 안됨
        // }
        ErrorHandling handling = new ErrorHandling();
        
        try {
            handling.checkZero(c);
        } catch (IsZeroException e) {
            System.err.println("It is Zero!");
        }
        
        try {
            c = 4 / 0;
        } catch(ArithmeticException e) {
            c = -1;
        } finally {
            System.out.printf("%d\n", c);
        }
    }
}
