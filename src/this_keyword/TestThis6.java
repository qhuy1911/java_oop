package this_keyword;

class A3 {
    A3(){
        this(5);
        System.out.println("Hello a");
    }
    A3(int x) {
        System.out.println(x);
    }
}

public class TestThis6 {
    public static void main(String[] args) {
        A3 a = new A3();
    }
}
