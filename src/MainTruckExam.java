class Car {
  String carname;
  String Color;
  int velocity;

  void speedUp() {
    velocity += 10;
    System.out.println("속도 " + velocity + " 증가");
  }

  void speedDown() {
    velocity -= 10;
    System.out.println("속도 " + velocity + " 감소");
  }
}

class Truck extends Car {
  int ton = 5;

  void speedUp() {
    velocity += 20;
    System.out.println("속도 " + velocity + " 증가");
  }
}

class MainTruckExam {
  public static void main(String[] args) {
    Truck myTruck = new Truck();
    myTruck.speedUp();
    myTruck.speedDown();
  }
}