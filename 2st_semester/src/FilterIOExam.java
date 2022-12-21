import java.io.*;

public class FilterIOExam {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(740);
        dos.writeDouble(3.1415926535);
        fos.close();

        FileInputStream fis = new FileInputStream("test.txt");
        DataInputStream dis = new DataInputStream(fis);
        int data = dis.readInt();
        double p = dis.readDouble();

        System.out.println(data);
        System.out.println(p);
    }
}
