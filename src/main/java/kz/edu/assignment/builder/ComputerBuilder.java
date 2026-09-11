package kz.edu.assignment.builder;

public interface ComputerBuilder {
    ComputerBuilder processor(String processor);

    ComputerBuilder memoryGb(int memoryGb);

    ComputerBuilder storageGb(int storageGb);

    ComputerBuilder graphicsCard(String graphicsCard);

    ComputerBuilder operatingSystem(String operatingSystem);

    ComputerBuilder addPeripheral(String peripheral);

    Computer build();
}

