/*
QUESTION:
Implementing the Proxy Pattern
Scenario: Proxy pattern for caching image loading.
*/

interface Image { void display(); }
class RealImage implements Image {
    private String filename;
    public RealImage(String fn) { this.filename = fn; System.out.println("Loading " + fn); }
    public void display() { System.out.println("Displaying " + filename); }
}
class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;
    public ProxyImage(String fn) { this.filename = fn; }
    public void display() {
        if (realImage == null) realImage = new RealImage(filename);
        realImage.display();
    }
}
public class Exercise6_ProxyPattern_Solution {
    public static void main(String[] args) {
        Image img = new ProxyImage("photo.png");
        img.display(); // Loads and displays
        img.display(); // Displays from cache
    }
}
