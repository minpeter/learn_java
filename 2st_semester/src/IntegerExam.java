public class IntegerExam {
    public static void main(String[] args) {
        int i = 100;
        Integer i1 = i;
        Integer i2 = Integer.valueOf(100);
//        Integer i3 = new Integer(100);
//더 이상 사용하지 않음
        System.out.println("i1.equals(i2) = " + i1.equals(i2));
        System.out.println("i1 == i2 = " + (i1 == i2));
    }
}
