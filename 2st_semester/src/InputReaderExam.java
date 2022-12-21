import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputReaderExam {
    public static void main(String[] args) {
        InputStream reader = System.in;

        try {
            while(true){
                int i = reader.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.print(c);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println();
    }
}