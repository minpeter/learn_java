class GrandFather {
  private String name;

  public GrandFather() {
  }

  public GrandFather(String name) {
    this.name = name;
    System.out.println("GrandFather 생성자");
  }
}

public class MyClass extends GrandFather {
  public MyClass(String name) {
    super(name);
    System.out.println("MyClass 생성자");
  }

  public static void main(String[] args) {
    MyClass myClass = new MyClass("홍길동");
  }
}