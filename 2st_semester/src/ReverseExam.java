public class ReverseExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("java programming");
        StringBuffer sb2 = null;

        sb2 = sb1.reverse();
        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);
    }
}
