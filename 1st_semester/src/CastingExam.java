class Car {
  String name = "차";

  String print() {
    return "[나는" + name + "이다]";
  }
}

class Bus extends Car {
  String name = "버스";

  String print() {
    return "[차의 종류는" + name + "이다]";
  }
}

class Truck extends Car {
  String name = "트럭";

  String print() {
    return "[차의 종류는" + name + "이다]";
  }
}

public class CastingExam {

  public static void main(String[] args) {
    Car mycar, yourcar;
    Bus mybus, yourbus;
    Truck mytruck, yourtrck;
    mycar = new Car();
    mybus = new Bus();
    mytruck = new Truck();

    System.out.println("[" + mycar.print() + "]");
    System.out.println("[" + mybus.print() + "]");
    System.out.println("[" + mytruck.print() + "]");

    yourcar = mybus;
    yourbus = (Bus) yourcar;
    System.out.println("[" + yourbus.print() + "]");
    yourcar = mytruck;
    yourtrck = (Truck) yourcar;
    System.out.println("[" + yourtrck.print() + "]");

  }
}
