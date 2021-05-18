import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriterTextFileMain {
    public static void main(String[] args) {
        try (PrintWriter print = new PrintWriter(new FileOutputStream("src/text.txt"))) {
            for (int i = 1; i <= 100; i++) {
                print.println("Line " + i);
            }

            print.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("File recorder.");
    }
}
