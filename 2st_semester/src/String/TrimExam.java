package String;

public class TrimExam {
    public static void main(String[] args) {
        String str1 = "  This is TEST    ";

        // 그냥 출력?
        System.out.print(str1);
        System.out.println("END");

        // trim()한 결과
        System.out.print(str1.trim());
        System.out.println("END");
    }
}