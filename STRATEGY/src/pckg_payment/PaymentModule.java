package pckg_payment;

public class PaymentModule {

    private PaymentStrategy paymentStrategy;

    public PaymentModule(PaymentStrategy ps) {
        System.out.println("Some payment module...");
        this.paymentStrategy = ps;
    }

    public void performPayment(double amount) {
        paymentStrategy.performPayment(amount);
    }

    public void setPaymentStrategy(PaymentStrategy ps) {
        this.paymentStrategy = ps;
    }
}
