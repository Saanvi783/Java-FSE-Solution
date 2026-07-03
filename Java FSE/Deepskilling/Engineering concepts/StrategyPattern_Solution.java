/*
QUESTION:
Implementing the Strategy Pattern
Scenario: Strategy pattern for CreditCard/PayPal payment methods.
*/

interface PaymentStrategy { void pay(double amount); }
class CreditCardPay implements PaymentStrategy { public void pay(double amount) { System.out.println("Paid $" + amount + " via Credit Card"); } }
class ShoppingCart {
    private PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy s) { this.strategy = s; }
    public void checkout(double amount) { strategy.pay(amount); }
}
public class Exercise8_StrategyPattern_Solution {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setStrategy(new CreditCardPay());
        cart.checkout(200.0);
    }
}
