package Wrapper;

public class WrapValueOfExam {
    public static void main(String[] args) {
        String str1 = "1024";
        String str2 = "3.14";

        Byte b1 = Byte.valueOf(str1 );
        Byte b2 = Byte.valueOf(str2);
        Integer i1 = Integer.valueOf(str1);
//        Integer i2 = Integer.valueOf(str2);
        Double d1 = Double.valueOf(str1);
        Double d2 = Double.valueOf(str2);

        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.println("i1: " + i1);
//        System.out.println("i2: " + i2);
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);

    }
}
