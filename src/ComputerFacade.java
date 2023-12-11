public class ComputerFacade {
    private CPU cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public ComputerFacade() {
        cpu = new CPU();
        hardDrive = new HardDrive();
        memory = new Memory();
    }

    // Facade method to start the computer
    public void start() {
        System.out.println("Computer starting...");
        memory.loadMemory();
        hardDrive.readData();
        cpu.processData();
        System.out.println("Computer started");
    }

    // Facade method to shut down the computer
    public void shutDown() {
        System.out.println("Computer shutting down...");
        System.out.println("Computer shut down");
    }

    // Facade method to print the data loaded into memory one "memory address" at a time
    public void printMemoryData() {
        System.out.println("Data loaded into memory:");

        for (int i = 0; i < memory.readMemoryAddress(0); i++) {
            char data = memory.readMemoryAddress(i);
            System.out.println("Memory address " + i + ": " + data);
        }
    }

}
