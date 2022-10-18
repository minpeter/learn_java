package Math;

import java.util.Scanner;

public class PythagoreanTheorem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 점의 X 좌표를 입력하세요 >> ");
        float x1 = Float.parseFloat(sc.nextLine());
        System.out.print("첫번째 점의 Y 좌표를 입력하세요 >> ");
        float y1 = Float.parseFloat(sc.nextLine());


        System.out.print("두번째 점의 X 좌표를 입력하세요 >> ");
        float x2 = Float.parseFloat(sc.nextLine());
        System.out.print("두번째 점의 Y 좌표를 입력하세요 >> ");
        float y2 = Float.parseFloat(sc.nextLine());

        System.out.println("두 점 사이의 거리는 " + Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)) + "입니다.");
    }
}