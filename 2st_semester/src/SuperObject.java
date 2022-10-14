public class SuperObject {

    public SuperObject(String name) {
        this.name = name;
    }
    protected String name; // 하위클래스에서만 사용할 수 있도록
    public void draw() {
        System.out.println("Super Object");
    }

    public void paint() {
        draw();
    }
}

