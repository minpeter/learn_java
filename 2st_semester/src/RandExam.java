public class RandExam {
    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println((int)Math.random() * 5); //연산 순위로 인해 int 연산이 먼저되고 따라서 0이 출력됨
        System.out.println((int)(Math.random() * 5));
        //0 이상 10 미만의 수 출력
        System.out.println((int)(Math.random() * 10));
        System.out.println((int)(Math.random() * 100));

        //0 이상 10 이하의 수 출력
        System.out.println(Math.round(Math.random() * 10));
    }
}
