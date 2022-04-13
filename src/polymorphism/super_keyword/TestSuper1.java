package polymorphism.super_keyword;

class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";
    void printColor() {
        System.out.println(color); // black
        System.out.println(super.color); // white
    }
}

public class TestSuper1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();
    }
}
