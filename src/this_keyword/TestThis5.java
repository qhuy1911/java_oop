package this_keyword;

class A2 {
    A2() {
        System.out.println("Hello a");
    }

    A2(int x) {
        this();
        System.out.println(x);
    }
}

public class TestThis5 {
    public static void main(String[] args) {
        A2 a = new A2(10);
    }
}
