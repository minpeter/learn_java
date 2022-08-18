public class Bit {
  public static void main(String[] args) {
    byte a = 5;
    byte b = (byte) (a << 2);
    System.out.println("b = " + b);

    a = 20;
    b = (byte) (a >> 2);
    System.out.println("b = " + b);

    a = 20;
    b = (byte) (a >> 2);
    System.out.println("b = " + b);

    a = (byte) 0xf8;
    b = (byte) (a >> 2);
    System.out.println("b = " + b);
  }
}
