/*
QUESTION:
Exercise 3: Sorting Customer Orders
Scenario: You are developing an order processing system for an e-commerce platform. Orders need to be sorted by total price to prioritize high-value orders.
Instructions:
1. Define an Order class with orderId, customerName, totalPrice.
2. Implement Bubble Sort and Quick Sort algorithms.
3. Compare their complexity (Bubble Sort O(N^2) vs Quick Sort O(N log N)).
*/

class Order {
    String orderId;
    String customerName;
    double totalPrice;

    public Order(String orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return orderId + ": $" + totalPrice + " (" + customerName + ")";
    }
}

public class Exercise3_SortingCustomerOrders_Solution {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j+1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j+1];
                    orders[j+1] = temp;
                }
            }
        }
    }

    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i+1];
        orders[i+1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order("O1", "Alice", 250.0),
            new Order("O2", "Bob", 99.9),
            new Order("O3", "Charlie", 500.0)
        };
        quickSort(orders, 0, orders.length - 1);
        for (Order o : orders) System.out.println(o);
    }
}
