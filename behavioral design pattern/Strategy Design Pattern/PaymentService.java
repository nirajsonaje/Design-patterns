public class PaymentService {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void checkout(double amount) {
        if (strategy == null) {
            System.out.println("No payment method selected.");
            return;
        }
        strategy.pay(amount);
    }
}
