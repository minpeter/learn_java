package StringBuffer;

public class AppendExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer(" Java Programming");
        StringBuffer sb2 = new StringBuffer(" Project");
        StringBuffer str1 = null;
        StringBuffer str2 = null;
        int num = 10;
        double db = 12.5;
        char chr = 'A';

        str1 = sb1.append("Project");
        str2 = sb1.append(sb2);
        sb2.append(num).append(db).append(chr);

        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
