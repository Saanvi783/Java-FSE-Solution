/*
QUESTION:
Implementing the Builder Pattern
Scenario: Build Computer object with optional RAM, Storage, CPU.
*/

class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private Computer(Builder b) { this.CPU = b.CPU; this.RAM = b.RAM; this.storage = b.storage; }
    public static class Builder {
        private String CPU, RAM, storage;
        public Builder setCPU(String cpu) { this.CPU = cpu; return this; }
        public Builder setRAM(String ram) { this.RAM = ram; return this; }
        public Builder setStorage(String storage) { this.storage = storage; return this; }
        public Computer build() { return new Computer(this); }
    }
    @Override public String toString() { return "Computer [" + CPU + ", " + RAM + ", " + storage + "]"; }
}
public class Exercise3_BuilderPattern_Solution {
    public static void main(String[] args) {
        Computer comp = new Computer.Builder().setCPU("i7").setRAM("16GB").setStorage("512GB SSD").build();
        System.out.println(comp);
    }
}
