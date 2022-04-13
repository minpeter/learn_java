public class ForExam2 {
  public static void main(String args[]) {
    int even_sum = 0, odd_sum = 0;
    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        even_sum += i;
      } else {
        odd_sum += i;
      }
    }
    System.out.println("1부터 10까지의 짝수의 합은 " + even_sum + "이고, " +
        "홀수의 합은 " + odd_sum + "이다.");
  }
}
