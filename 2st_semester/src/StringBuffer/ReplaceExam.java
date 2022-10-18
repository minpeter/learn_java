package StringBuffer;

public class ReplaceExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("today is a good day");
        StringBuffer sb2 = null;

        sb2 = sb1.replace(11, 19, "bad day");

        System.out.println("sb2 = " + sb2);
    }
}
