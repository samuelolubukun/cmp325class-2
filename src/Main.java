import main.CPU;
import main.Computer;
import main.RAM;

public class Main {
    public static void main(String[] args) {

        Computer hp250 = new Computer(16,
        new CPU(1.5f, "coreI5"),
        new RAM(5, "DDR3"));

        System.out.println(hp250);
    }
}