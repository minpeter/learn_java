public class TrimExam {
    public static void main(String[] args) {
        String s = "  This is TEST  ";
        String s2 = "hi Hello";
        System.out.print(s);
        System.out.println("END");
        System.out.print(s.trim());
        System.out.println("END");

        System.out.println(s2.substring(3));
        System.out.println(s2.substring(0, 2));


    }
}
