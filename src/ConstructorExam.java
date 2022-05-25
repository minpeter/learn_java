public class ConstructorExam {
  public static void main(String[] args) {
    Student kim = new Student();
    Student jang = new Student("민웅기");
    Student fill = new Student("김장필", 2);
    kim.getName();
    jang.getName();
    fill.getName();
  }
}

class Student {
  String name;
  int grade;
  int ban;
  int number;
  String telephone;

  // 기본 생성자 형태
  public Student() {
  }

  // name을 초기화하는 생성자
  public Student(String n) {
    name = n;
  }

  // name, garde를 초기화하는 생성자
  public Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }

  public void getName() {
    System.out.println("학생의 이름은 " + this.name + "이고, " + "학년은 " + this.grade + " 입니다.");
  }
}
