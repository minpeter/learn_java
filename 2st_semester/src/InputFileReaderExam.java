import java.io.*;

public class InputFileReaderExam {
    public static void main(String[] args) throws FileNotFoundException {
        try (Reader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream("large_in.txt")
        ))) {
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