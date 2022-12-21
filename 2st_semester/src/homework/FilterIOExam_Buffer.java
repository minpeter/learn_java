package homework;

import java.io.*;

public class FilterIOExam_Buffer {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("data.dat");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream fOut = new DataOutputStream(bos);
        fOut.writeInt(740);
        fOut.writeDouble(3.1415926535);

        fOut.flush();

        FileInputStream fis = new FileInputStream("data.dat");
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream fIn = new DataInputStream(bis);
        int data = fIn.readInt();
        double p = fIn.readDouble();

        System.out.println(data);
        System.out.println(p);
    }
}
