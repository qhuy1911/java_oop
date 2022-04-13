package polymorphism.method_overriding;

class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

public class TestBank {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("SBI Rate of Interest: " + icici.getRateOfInterest());
        System.out.println("SBI Rate of Interest: " + axis.getRateOfInterest());
    }
}
