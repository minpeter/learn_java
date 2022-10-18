package Math;

public class Lottery {
    public static void main(String[] args) {
        System.out.println("이번주 행운의 번호는 ");

        int[] lotto = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            int num = (int)(Math.random() * 45) + 1;
            lotto[i] = num;
            for (int j = 0; j < i; j++) {
                if (lotto[j] == num) {
                    i--;
                    break;
                }
            }
            System.out.print(num + " ");
        }
    }
}