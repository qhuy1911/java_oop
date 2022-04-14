package abstraction;

interface Drawable {
    void draw();
}

class Rectangle1 implements Drawable {

    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle1 implements Drawable {

    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}

public class TestInterface1 {
    public static void main(String[] args) {
        Drawable d = new Circle1();
        d.draw();
    }
}
