class Greeting {
  public String name = "홍길홍";

  public void sayHello() {
    System.out.println("Hello, " + name);
  }
}

public class EngHello extends Greeting {

  public String name = "Mr.Hong";

  public void sayHello() {
    System.out.println(name + "Nice to meet you");
  }

  public void test() {
    System.out.println(super.name);
    super.sayHello();
  }

  public static void main(String[] args) {
    EngHello eng = new EngHello();
    eng.sayHello();
    eng.test();
  }
}