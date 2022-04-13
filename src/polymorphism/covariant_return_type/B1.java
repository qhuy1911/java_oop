package polymorphism.covariant_return_type;

class A {
    A get() {
        return this;
    }
}

public class B1 extends A{
    @Override
    B1 get() {
        return this;
    }

    void message() {
        System.out.println("Welcome to covariant return type");
    }

    public static void main(String args[]){
        new B1().get().message();
    }
}
