public class MOverLoadingEaxm {
  public static void main(String args[]) {
    Add a = new Add();
    System.out.println(a.sum("선린", "인터넷"));
    System.out.println(a.sum(10, 20));
  }
}

class Add {
  String sum(String a, String b) {
    return a + b;
  }

  // String sum(String m, String n) {
  // return m + n;
  // } 이건 안됨 ㅋㅋ 타입 자체가 달아야됨

  int sum(int a, int b) {
    return a + b;
  }
}
