package Math;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int num = (int) (Math.round(Math.random() * 100));
        int input = 0;
        int count = 0;
        String tmp = "";
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("0과 100사이의 값을 입력하세요 :");
            tmp = s.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
            input = Integer.parseInt(tmp); //입력받은 문자열(tmp)을 숫자로 변환
            count++;
            if (input > num) {
                System.out.println("더 작은 수를 입력하세요.");
            } else if (input < num) {
                System.out.println("더 큰 수를 입력하세요.");
            } else {
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 " + count + "번입니다.");
                break;
            }
        } while (true);
    }
}