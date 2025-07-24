public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        // Pay with Credit Card
        paymentService.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        paymentService.checkout(1500.00);

        // Pay with UPI
        paymentService.setPaymentStrategy(new UPIPayment("niraj@upi"));
        paymentService.checkout(999.00);

        // Pay with PayPal
        paymentService.setPaymentStrategy(new PayPalPayment("niraj@example.com"));
        paymentService.checkout(2499.00);
    }
}
// You want to support multiple payment methods like:

// Credit Card

// UPI

// PayPal

// Each payment method is a strategy.

// Component	Purpose
// PaymentStrategy	Strategy interface
// CreditCardPayment, UPIPayment, etc.	Concrete strategies
// PaymentService	Context that uses the strategy
// Main	Client sets strategy at runtime
