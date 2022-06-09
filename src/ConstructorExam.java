public class ConstructorExam {
  public static void main(String[] args) {
    Student kim = new Student();
    Student jang = new Student("민웅기");
    Student fill = new Student("김장필", 2);
    kim.getName();
    jang.getName();
    fill.getName();

    System.out.println("======================");

    Student kim2 = new Student("김현우");

    kim2.setGrade(2);

    kim2.getName();
    kim2.getGrade();
  }
}

class Student {

  private String name;
  private int grade;

  // 기본 생성자 형태
  public Student() {
  }

  // name을 초기화하는 생성자
  public Student(String n) {
    this.name = n;
  }

  // name, garde를 초기화하는 생성자
  public Student(String name, int grade) {
    // this.name = name;
    this(name); // 알아서 name이라는 매겨변수을 가지는 생성자를 호출함
    this.grade = grade;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void getName() {
    System.out.println("학생의 이름은 " + this.name + " 입니다.");
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public void getGrade() {
    System.out.println("학생의 학년은 " + this.grade + " 입니다.");
  }
}
