package Wrapper;

public class WrapExam {
    public static void main(String[] args) {
        int i = 365;
        double d = 36.5;
        Integer wint = 2022;
        Double wdouble = 3.14;

        String id = Double.toString(i+d);

        System.out.println("i = " + i);
        System.out.println("d = " + d);
        System.out.println("id = " + id);
        System.out.println("wint = " + wint.toString());
        System.out.println("wdouble = " + wdouble.toString());
    }
}
