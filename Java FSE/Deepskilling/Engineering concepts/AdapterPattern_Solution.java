/*
QUESTION:
Implementing the Adapter Pattern
Scenario: Adapter for third-party payment gateways like PayPal/Stripe.
*/

interface PaymentProcessor { void processPayment(double amount); }
class PayPalGateway { void makePayment(double dollars) { System.out.println("PayPal payment: $" + dollars); } }
class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway paypal = new PayPalGateway();
    public void processPayment(double amount) { paypal.makePayment(amount); }
}
public class Exercise4_AdapterPattern_Solution {
    public static void main(String[] args) {
        PaymentProcessor processor = new PayPalAdapter();
        processor.processPayment(150.0);
    }
}
