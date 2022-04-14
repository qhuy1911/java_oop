package polymorphism.final_keyword;

public class A {
    static final int data;
    static {
        data = 50;
    }

    public static void main(String[] args) {
        System.out.print(A.data);
    }
}
