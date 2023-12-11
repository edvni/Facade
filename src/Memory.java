public class Memory {
    private char[] data;

    public Memory() {
        data = new char[1024]; // Memory size of 1024 bytes
    }

    public void loadMemory() {
        // load sample data into memory
        for (int i = 0; i < data.length; i++) {
            data[i] = (char) ('A' + i % 26); // Fill memory with letters A-Z
        }
        System.out.println("Memory is loading data");
    }

    public char readMemoryAddress(int address) {
        return data[address];
    }
}
