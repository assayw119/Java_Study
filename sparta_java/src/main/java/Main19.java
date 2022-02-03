import java.io.FileOutputStream;
import java.io.IOException;

public class Main19 {
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("test.txt")) {
            // test.txt file에 Hello Java 를 출력
            out.write("Hello Java".getBytes());
            out.flush();
        } catch (IOException e) {
            System.out.println("IOException 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
