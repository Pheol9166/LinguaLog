package Practice;

/*
 * 게시판 페이징
 * 메서드 이름은 getTotalPage이다.
 * 입력 받는 값은 게시물의 총 개수(m), 한 페이지에 보여 줄 게시물 수(n)이다.
 * 출력하는 값은 총 페이지 수이다.
 * 
 * ex) m = 5, n = 10이면 총 페이지 수 1
 */

public class Problem2 {
    static int getTotalPage(int m, int n) {
        // int라 뒤의 값은 잘림
        if (m % n == 0) {
            return m / n;
        } else {
            return m / n + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getTotalPage(30, 5));
    }
}
