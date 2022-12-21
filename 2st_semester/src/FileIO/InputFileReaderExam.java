package FileIO;

import java.io.*;

public class InputFileReaderExam {
//    public static void streamTest(InputStream is) {
      public static void streamTest(FileInputStream is) {
        try {
            Reader reader = new InputStreamReader(is);
            while(true) {
                int i = reader.read();
                if (i == -1) break;
                char c = (char) i;
                System.out.print(c);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("large_in.txt");
        FileInputStream fis = new FileInputStream("large_in.txt");
        streamTest(fis);
        if(fis != null) fis.close();
    }
}
