public class EqualExam {
    public static void main(String[] args) {
        String s1 = "Hansei";
        String s2 = "Hansei";
        String s3 = new String("High-school");
        String s4 = new String("High-school");

        if (s1 == s2) System.out.println("s1 == s2"); //주소가 같다
        else System.out.println("s1 != s2"); //주소가 다르다

        if (s3 == s4) System.out.println("s3 == s4");
        else System.out.println("s3 != s4");

        if (s1.equals(s2)) System.out.println("s1 equals s2"); //내용이 같다.
        else System.out.println("s1 not equals s2"); //내용이 다르다.

        if (s3.equals(s4)) System.out.println("s3 equals s4");
        else System.out.println("s3 not equals s4");
    }
}