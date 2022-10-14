public class AppendExam {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("java Programming");
        StringBuffer sb2 = new StringBuffer(" project");
        StringBuffer str1= null;
        StringBuffer str2= null;

        int num=10;
        double db=12.5;
        char ch='A';

        str1 = sb1.append(" is fun");
        str2 = sb1.append(sb2);
        str2.append(num).append(db).append(ch);

        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println();

    }
}
