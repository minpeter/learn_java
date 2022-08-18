public class CastingExam2 {
  public static void main(String args[]) {
    int a = 10;
    byte b = (byte) a; // explicit casting
    // 단 byte로 표현불가능한 범위의 int 값일 경우 전혀 다른 값이 저장된다.
    System.out.println(b);

    int c = 130;
    byte d = (byte) c; // explicit casting
    // 이런 경우 예상 밖의 값이 저장된다.
    // byte의 경우 -128 ~ 127까지 저장가능하므로 128이 넘어가면 -128, -127 로 돌아간다.
    System.out.println(d);

  }

}
