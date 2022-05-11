public class ClassExam {
  public static void main(String args[]) {
    Goods camera = new Goods();
    camera.name = "camera";
    camera.price = 400000;
    camera.numberOfStock = 30;
    camera.sold = 50;

    System.out.println("name: " + camera.name);
    System.out.println("price: " + camera.price);
    System.out.println("numberOfStock: " + camera.numberOfStock);
    System.out.println("sold: " + camera.sold);

  }
}

class Goods {
  String name;
  int price;
  int numberOfStock;
  int sold;
}