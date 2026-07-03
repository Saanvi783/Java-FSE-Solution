/*
QUESTION:
Exercise 1: Inventory Management System
Scenario: You are developing an inventory management system for a warehouse. The system needs to efficiently manage products, including adding, updating, and deleting products.
Instructions:
1. Define a Product class with attributes like productId, productName, quantity, and price.
2. Choose an appropriate data structure (e.g., ArrayList, HashMap) and explain your choice based on time complexity for add, update, and delete operations.
3. Implement the inventory management system with methods to add, update, and delete products.
*/

import java.util.HashMap;
import java.util.Map;

class Product {
    private String productId;
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Product[ID=" + productId + ", Name=" + productName + ", Qty=" + quantity + ", Price=" + price + "]";
    }
}

public class Exercise1_InventoryManagementSystem_Solution {
    // HashMap chosen for O(1) average time complexity for add, update, search, delete operations.
    private Map<String, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Added: " + product);
    }

    public void updateProduct(String productId, int quantity, double price) {
        Product p = inventory.get(productId);
        if (p != null) {
            p.setQuantity(quantity);
            p.setPrice(price);
            System.out.println("Updated: " + p);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }

    public void deleteProduct(String productId) {
        Product removed = inventory.remove(productId);
        if (removed != null) {
            System.out.println("Deleted: " + removed);
        } else {
            System.out.println("Product not found: " + productId);
        }
    }

    public static void main(String[] args) {
        Exercise1_InventoryManagementSystem_Solution sys = new Exercise1_InventoryManagementSystem_Solution();
        sys.addProduct(new Product("P101", "Laptop", 10, 999.99));
        sys.addProduct(new Product("P102", "Mouse", 50, 25.50));
        sys.updateProduct("P101", 12, 950.00);
        sys.deleteProduct("P102");
    }
}
