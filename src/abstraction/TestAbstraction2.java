package abstraction;

abstract class Bike2 {
    Bike2() {
        System.out.println("Bike is created");
    }

    abstract void run();

    void change() {
        System.out.println("get changed");
    }
}

class Honda2 extends Bike2{
    @Override
    void run(){
        System.out.println("running safely..");
    }
}

public class TestAbstraction2 {
    public static void main(String[] args) {
        Bike2 obj = new Honda2();
        obj.run();
        obj.change();
    }
}
