/*
QUESTION:
Implementing the Singleton Pattern
Scenario: Ensure a Logger class has only one instance using Singleton pattern.
*/

public class Exercise1_SingletonPattern_Solution {
    private static Exercise1_SingletonPattern_Solution instance;
    private Exercise1_SingletonPattern_Solution() {}
    public static synchronized Exercise1_SingletonPattern_Solution getInstance() {
        if (instance == null) instance = new Exercise1_SingletonPattern_Solution();
        return instance;
    }
    public void log(String msg) { System.out.println("[LOG] " + msg); }
    public static void main(String[] args) {
        Exercise1_SingletonPattern_Solution.getInstance().log("Singleton active.");
    }
}
