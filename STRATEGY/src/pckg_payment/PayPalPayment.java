package pckg_payment;

public class PayPalPayment  implements  PaymentStrategy{

    @Override
    public void performPayment(double amount) {
        System.out.println("Payment paid with PayPal account - amount: " + amount);

    }
}
