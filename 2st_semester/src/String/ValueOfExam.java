package String;

public class ValueOfExam {
    public static void main(String[] args) {
        char ch = 'A';
        double test = 11.2;
        char charr[] = new char[]{'a','b'};
        
        String str = String.valueOf(ch) + String.valueOf(test);
        System.out.println(str);

        // 위의 코드를 아래와 같이 수정하여 두 개의 차이점을 비교해보자!
        String str2 = String.valueOf(ch) + charr ;// 자동으로 .toString() 메소드가 호출된다
        System.out.println(str2);

        String str3 = String.valueOf(ch) + String.valueOf(charr); // charr가 String으로 변환된다
        System.out.println(str3);
    }
}