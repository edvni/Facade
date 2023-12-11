public class Main {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();

        // Client code can start the computer, shut it down, and print the data loaded into memory
        computer.start();
        System.out.println("--------------------");

        computer.printMemoryData();

        //computer.shutDown();
    }
}