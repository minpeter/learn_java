public class SubObject extends SuperObject{
    public SubObject(String name) {
        super(name);
    }
    public static void main(String[] args) {
        SubObject obj = new SubObject("minter");
        System.out.println(obj.name);
        obj.paint();
    }

    public void draw() {
        System.out.println("Sub Object");
    }
}
