/*
QUESTION:
Exercise 7: Financial Forecasting
Scenario: Create a tool to forecast future financial values based on past growth rates using recursive algorithms.
Instructions:
1. Implement a recursive method to calculate future value given current value, growth rate, and periods.
2. Optimize or discuss iterative alternative to avoid stack overflow.
*/

public class Exercise7_FinancialForecasting_Solution {
    // Recursive calculation: FV = PV * (1 + r)^n
    public static double calculateFutureValueRecursive(double currentValue, double growthRate, int periods) {
        if (periods == 0) return currentValue;
        return calculateFutureValueRecursive(currentValue * (1 + growthRate), growthRate, periods - 1);
    }

    // Iterative calculation for optimization: O(N) time, O(1) space
    public static double calculateFutureValueIterative(double currentValue, double growthRate, int periods) {
        double fv = currentValue;
        for (int i = 0; i < periods; i++) {
            fv *= (1 + growthRate);
        }
        return fv;
    }

    public static void main(String[] args) {
        double pv = 1000.0;
        double rate = 0.05; // 5%
        int periods = 5;
        System.out.println("Future Value (Recursive): " + calculateFutureValueRecursive(pv, rate, periods));
        System.out.println("Future Value (Iterative): " + calculateFutureValueIterative(pv, rate, periods));
    }
}
