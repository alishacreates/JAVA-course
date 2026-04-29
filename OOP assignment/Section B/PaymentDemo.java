interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }
}

class Card implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Card.");
    }
}

class NetBanking implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using NetBanking.");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment p1 = new UPI();
        Payment p2 = new Card();
        Payment p3 = new NetBanking();

        p1.pay(1500);
        p2.pay(2500);
        p3.pay(3500);
    }
}