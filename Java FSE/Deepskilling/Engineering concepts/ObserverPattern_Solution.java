/*
QUESTION:
Implementing the Observer Pattern
Scenario: Observer pattern for Stock Market price alerts.
*/

import java.util.*;
interface Observer { void update(double price); }
class StockMarket {
    private List<Observer> observers = new ArrayList<>();
    public void addObserver(Observer o) { observers.add(o); }
    public void setPrice(double price) { for (Observer o : observers) o.update(price); }
}
class MobileApp implements Observer { public void update(double price) { System.out.println("MobileApp Stock Price: $" + price); } }
public class Exercise7_ObserverPattern_Solution {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        market.addObserver(new MobileApp());
        market.setPrice(150.25);
    }
}
