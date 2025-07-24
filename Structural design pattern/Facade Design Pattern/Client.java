//Problem: Starting a computer requires interacting with several subsystems.
public class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }
}
