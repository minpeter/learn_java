package Object;

public class ObjExam {
    public static void main(String[] args) {
        ToStrTest test = new ToStrTest();
        String str = "Test Str";

        System.out.println(str.toString());
        System.out.println(System.out.toString());
        System.out.println(System.in.toString());
        System.out.println(test.toString());
    }
}

class ToStrTest {
    public int add(int a, int b) {
        return a + b;
    }
}
