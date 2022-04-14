package abstraction;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("drawing circle...");
    }
}

public class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s=new Circle();
        s.draw();
    }
}
