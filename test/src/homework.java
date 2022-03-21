public class homework {
  public static void main(String[] args) {
    short a = 10;
    char b = (char) a; // 명시적 형변환 필요

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    byte c = 10;
    char d = (char) c; // 명시적 형변환 필요

    System.out.println("c = " + c);
    System.out.println("d = " + d);

    char ch1 = 12;
    short sh1 = (short) ch1; // 명시적 형변환 필요

    System.out.println("ch1 = " + ch1);
    System.out.println("sh1 = " + sh1);

    short sh2 = 12;
    char ch2 = (char) sh2; // 명시적 형변환 필요

    System.out.println("sh2 = " + sh2);
    System.out.println("ch2 = " + ch2);
  }

}
