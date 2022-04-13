package polymorphism.super_keyword;

class Animal4 {
    Animal4() {
        System.out.println("animal is created");
    }
}

class Dog4 extends Animal4 {
    Dog4() {
        System.out.println("dog is created");
    }
}

public class TestSuper4 {
    public static void main(String args[]){
        Dog4 d=new Dog4();
    }
}
