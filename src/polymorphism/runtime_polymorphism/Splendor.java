package polymorphism.runtime_polymorphism;

class Bike {
    void run() {
        System.out.println("running...");
    }
}

public class Splendor extends Bike {
    void run() {
        System.out.println("running safely with 60km");
    }

    public static void main(String[] args) {
        Bike b = new Splendor();
        b.run();
    }

}
