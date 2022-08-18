class Car {
  Car() {
    System.out.println("Car 생성자");
  }

  Car(String name) {
    System.out.println("차 이름이 있는 Car 생성자");
  }
}

class Truck extends Car {
  Truck() {
    super("SM3");
    System.out.println("Truck 생성자");
  }

  public static void main(String[] args) {
    Truck myTruck = new Truck();
  }
}