package Advance;

import java.util.ArrayList;

// Thread
// 원래는 Thread를 상속받지만, 다른 걸 상속받을 때는 Runnable이라는 인터페이스를 씀
public class ThreadHandling implements Runnable {
    int seq;

    public ThreadHandling(int seq) {
        this.seq = seq;
    }

    // run 메서드를 구현해야 함
    public void run() {
        System.out.println(this.seq + " thread start");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(this.seq + " thread end");
    }

    static void normalThread() {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new ThreadHandling(i));   // Runnable로 바뀌면 new Thread로 감싸줘야함.
            t.start();  // start로 스레드를 실행함.
        }
        System.out.println("main is end");
    }
   /*
     * 결과를 보면 0번부터 9번 스레드까지 순서가 뒤죽박죽이고 일정치 않음
     * => 순서에 관계없이 동시 실행
     * main보다 빨리 종료되는 경우도 있음
     */
    
    // join으로 스레드가 모두 종료된 후 작업을 진행하게 함.
    static void joinThread() {
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new ThreadHandling(i));
            t.start();
            threads.add(t);
        }

        for (int i = 0; i < threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join();   // t 스레드가 종료할 때까지 기다림
            } catch (Exception e) {
            }
        }
        System.out.println("main is end");
    }

     public static void main(String[] args) {
        normalThread();
        System.out.println("-----------------");
        joinThread();
    }

 
}
