// 모든 도형은 둘레와 면적을 구할 수 있다고 할 때, 학생들에게 특정 도형 클래스를 만들어 둘레와 면적을 반드시 구하게 하려 한다.
// 즉, 도형 클래스에 둘레와 면적을 구하는 메소드를 작성하지않으면 에러가 발생하도록 하려고 한다.
// 이때, 반드시 작성해야 하는 메소드를 추상 클래스로 제공하면 된다.
// 도형의 둘레와 면적을 구하는 추상 클래스가 다음과 같을 때,

public class CircleExam {
  public static void main(String[] args) {
    ShapeExam shape = new Shape(5);
    System.out.println("둘레: " + shape.getCircum());
    System.out.println("면적: " + shape.getArea());
  }
}

abstract class ShapeExam {
  public abstract double getArea();

  public abstract double getCircum();
}

// 위 ShapeExam 클래스를 상속받아 원의 둘레와 면적을 구하는 도형 클래스를 작성하시오.
class Shape extends ShapeExam {
  private double radius;

  public Shape(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public double getCircum() {
    return 2 * radius * Math.PI;
  }
}