package abstraction;

interface Drawable2 {
    void draw();
    default void msg(){
        System.out.println("default method");
    }
}

class Rectangle2 implements Drawable2 {
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

public class TestInterfaceDefault{
    public static void main(String[] args) {
        Drawable2 obj = new Rectangle2();
        obj.draw();
        obj.msg();
    }

}
