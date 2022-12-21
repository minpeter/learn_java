import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FouExcept {
    public static void main(String[] args) {
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fw = new FileWriter("data.txt");
            fw.write("한국");
            System.out.println(">> 한국");
            fw.close();

            fr = new FileReader("data.txt");
            Scanner sc = new Scanner(fr);
            String str = sc.nextLine();
            System.out.println(str + " <<");

            fr.close();
        } catch (IOException e) {
            System.err.println("IOException이 발생하였습니다.");
            e.printStackTrace();
        } finally {
            System.out.println("예외 발생 여부와 상관없이 실행됩니다.");
        }
        System.out.println("프로그램이 정상 종료되었습니다.");
    }
}
