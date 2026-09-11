package kz.edu.assignment.builder;

import java.util.List;

public final class Computer {
    private final ComputerType type;
    private final String processor;
    private final int memoryGb;
    private final int storageGb;
    private final String graphicsCard;
    private final String operatingSystem;
    private final List<String> peripherals;

    Computer(
            ComputerType type,
            String processor,
            int memoryGb,
            int storageGb,
            String graphicsCard,
            String operatingSystem,
            List<String> peripherals
    ) {
        this.type = type;
        this.processor = processor;
        this.memoryGb = memoryGb;
        this.storageGb = storageGb;
        this.graphicsCard = graphicsCard;
        this.operatingSystem = operatingSystem;
        this.peripherals = List.copyOf(peripherals);
    }

    public ComputerType getType() {
        return type;
    }

    public String getProcessor() {
        return processor;
    }

    public int getMemoryGb() {
        return memoryGb;
    }

    public int getStorageGb() {
        return storageGb;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public List<String> getPeripherals() {
        return peripherals;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "type=" + type +
                ", processor='" + processor + '\'' +
                ", memoryGb=" + memoryGb +
                ", storageGb=" + storageGb +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", peripherals=" + peripherals +
                '}';
    }
}

