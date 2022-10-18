package Etc;

public class ValueOfExam {
    public static void main(String[] args) {
        char ch = 'A'; // 문자
        String str = "ABCDDF"; // 문자열
        int i = 10; // 정수

        String export = String.valueOf(ch) + i;
        System.out.println(export);

        char charr[] = new char[] {'a', 'b', 'c', 'd', 'e'};
        System.out.println(String.valueOf(charr));
    }
}