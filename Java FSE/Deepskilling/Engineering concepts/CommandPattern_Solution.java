/*
QUESTION:
Implementing the Command Pattern
Scenario: Command pattern for Home Automation Light control.
*/

interface Command { void execute(); }
class Light { void turnOn() { System.out.println("Light ON"); } }
class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light l) { this.light = l; }
    public void execute() { light.turnOn(); }
}
public class Exercise9_CommandPattern_Solution {
    public static void main(String[] args) {
        Light light = new Light();
        Command cmd = new LightOnCommand(light);
        cmd.execute();
    }
}
