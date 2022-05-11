public class MemberExam {
  public static void main(String args[]) {
    Student kim = new Student();
    kim.name = "민웅기";
    kim.grade = 2;
    kim.ban = 2;
    kim.number = 10;

    // kim.telephone = "111-111";

    System.out.println("이름: " + kim.name);
    System.out.println("학년: " + kim.grade);
    System.out.println("반: " + kim.ban);
    System.out.println("번호: " + kim.number);

    // System.out.println("전화번호: " + kim.telephone);

  }
}

class Student {
  public String name;
  int grade;
  int ban;
  int number;
  private String telephone;
}