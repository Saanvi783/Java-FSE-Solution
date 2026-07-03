/*
QUESTION:
Exercise 2: E-commerce Platform Search Function
Scenario: You are working on the search function of an e-commerce platform. The system needs to search for products efficiently by product ID, name, or category.
Instructions:
1. Define a Product class with productId, productName, category.
2. Implement Linear Search and Binary Search algorithms.
3. Compare performance based on time complexity.
*/

import java.util.Arrays;
import java.util.Comparator;

class ProductItem {
    int productId;
    String productName;
    String category;

    public ProductItem(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "[" + productId + "] " + productName + " (" + category + ")";
    }
}

public class Exercise2_EcommerceSearchFunction_Solution {
    // Linear Search: O(N) time complexity
    public static ProductItem linearSearch(ProductItem[] products, int targetId) {
        for (ProductItem p : products) {
            if (p.productId == targetId) return p;
        }
        return null;
    }

    // Binary Search: O(log N) time complexity
    public static ProductItem binarySearch(ProductItem[] products, int targetId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == targetId) return products[mid];
            if (products[mid].productId < targetId) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        ProductItem[] products = {
            new ProductItem(101, "Phone", "Electronics"),
            new ProductItem(205, "Shirt", "Apparel"),
            new ProductItem(302, "Book", "Stationery")
        };

        System.out.println("Linear Search: " + linearSearch(products, 205));
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
        System.out.println("Binary Search: " + binarySearch(products, 205));
    }
}
