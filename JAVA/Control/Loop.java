package Control;

public class Loop {
    public static void main(String[] args) {
        // while문
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println(String.format("count: %d", count));
            if (count == 10) {
                System.out.println("count is 10!");
            }
        }
        System.out.println("---------------");

        // for문
        String[] names = {"Kim", "Park", "Jung"};

        for (int i = 0; i < names.length; i++) {
            if (names[i] == "Park") {continue;}
            System.out.println(names[i]);
        }

        // 별내리기
        for (int j = 5; j > 0; j--) {
            System.out.println("*".repeat(j));
        }

        // 피라미드 별내리기
        int n = 5;
        for (int i = n / 2; i >= 0; i--) {
            System.out.print(" ".repeat(i));
            System.out.println("*".repeat(n - 2 * i));
        }
        
        System.out.println("---------------");

        /*
         * for each
         * 
         * for (type 변수명: iterate)
         */
        String[] nums = {"one", "two", "three"};
        for (String num: nums) {
            System.out.println(num);
        }
    }
}