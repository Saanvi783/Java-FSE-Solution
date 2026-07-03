/*
QUESTION:
Implementing the Decorator Pattern
Scenario: Decorator pattern for Email/SMS notifications.
*/

interface Notifier { void send(String msg); }
class EmailNotifier implements Notifier { public void send(String msg) { System.out.println("Email: " + msg); } }
abstract class NotifierDecorator implements Notifier {
    protected Notifier wrapped;
    public NotifierDecorator(Notifier n) { this.wrapped = n; }
    public void send(String msg) { wrapped.send(msg); }
}
class SMSDecorator extends NotifierDecorator {
    public SMSDecorator(Notifier n) { super(n); }
    public void send(String msg) { super.send(msg); System.out.println("SMS: " + msg); }
}
public class Exercise5_DecoratorPattern_Solution {
    public static void main(String[] args) {
        Notifier n = new SMSDecorator(new EmailNotifier());
        n.send("Security Alert!");
    }
}
