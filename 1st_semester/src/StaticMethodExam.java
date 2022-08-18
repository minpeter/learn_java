public class StaticMethodExam {
  public static void main(String args[]) {
    Student kim = new Student();
    Student jang = new Student();
    Student fill = new Student();

    System.out.println("생성된 학생 수 : " + Student.getCount());
  }
}

class Student {
  String name;
  int grade;
  private static int count = 0;

  public Student() {
    count++;
  }

  public static int getCount() {
    return count;
  }
}