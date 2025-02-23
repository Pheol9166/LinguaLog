package IO;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileIO {
    public static void main(String[] args) throws IOException {
        // FileOutputStream: byte 단위로 처리
        FileOutputStream output = new FileOutputStream("./JAVA/IO/out.txt");

        for (int i = 1; i <= 10; i++) {
            String data = i + "번째 줄입니다. \r\n";    // \r: 줄바꿈 문자
            output.write(data.getBytes());  // byte단위로 데이터를 처리해야함.
        }

        output.close();

        // FileWriter: byte 배열 대신 문자열 사용
        FileWriter fw = new FileWriter("./JAVA/IO/out.txt");
        for (int i = 1; i <= 10; i++) {
            String data = i + "번째 줄입니다. \r\n";
            fw.write(data);
        }
        fw.close();

        // PrintWriter: \r\n 대신 println 메서드 사용 가능
        PrintWriter pw = new PrintWriter("./JAVA/IO/out.txt");
        for (int i = 1; i <= 10; i++) {
            String data = i + "번째 줄입니다.";
            pw.println(data);
        }
        pw.close();


        // 파일 수정
        FileWriter fw2 = new FileWriter("./JAVA/IO/out.txt", true); // 추가 모드로 염
        for (int i = 11; i < 21; i++) {
            String data = i + "번째 줄입니다.\r\n";
            fw2.write(data);
        }
        fw2.close();

        // printwriter의 경우에는 new PrintWriter(new FileWriter("c:/out.txt", true)) 이런 느낌으로

        // 파일 읽기
        // FileInputStream
        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream(("./JAVA/IO/out.txt"));
        input.read(b);
        System.out.println(new String(b));  // 다시 문자열로 바꿔서 출력
        input.close();

        System.out.println("---------------------------");

        // FileReader + BufferedReader
        BufferedReader br = new BufferedReader(new FileReader("./JAVA/IO/out.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        br.close();
    }
}
