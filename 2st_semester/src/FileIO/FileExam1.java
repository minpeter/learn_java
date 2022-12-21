package FileIO;

import java.io.FileReader;
import java.io.FileWriter;

public class FileExam1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data.txt");
            FileWriter fw = new FileWriter("data2.txt");
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
        } catch (Exception e) {
            System.out.println("toString()");
            System.out.println(e.toString());


            System.out.println("getMessage()");
            System.out.println(e.getMessage());

            System.out.println("printStackTrace()");
            e.printStackTrace();
        }
    }
}
