package StringBuffer;

public class ToStringExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("TsSTThis");
        String str = null;

        str = sb1.toString();

        System.out.println("대문자: " + str.toUpperCase());
        System.out.println("소문자: " + str.toLowerCase());
    }
}
