package IO;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) throws IOException {
        /*
         * 콘솔 입출력
         * 
         * InputStream: 바이트 단위의 데이터를 읽어들일 때 사용하는 내장 클래스.
         * 
         * Stream: byte의 흐름을 추상화한 개념.
         */
        InputStream in = System.in;

        int a;
        a = in.read();  // 1byte 크기의 사용자 입력을 받아들임, 아스키코드

        System.out.println(a);

        // byte[] b = new byte[5];  byte 여러 개를 받으려면 
        
        System.out.println("---------------");

        // InputStreamReader: Char를 읽음
        InputStreamReader reader = new InputStreamReader(System.in);
        char[] b = new char[3]; // 읽을 개수 지정
        reader.read(b);

        System.out.println(b);
        System.out.println("---------------");

        // BufferedReader: String을 읽음
        BufferedReader br = new BufferedReader(reader);

        String str = br.readLine();
        System.out.println(str);

        System.out.println("---------------");

        /*
         * Scanner
         * 
         * next: 토큰을 읽어들임
         * nextLine: 라인을 읽어들임
         * nextInt: 정수를 읽어들임
         */
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
        sc.close();
    }
}
