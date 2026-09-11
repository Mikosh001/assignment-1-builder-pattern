package builder;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractComputerBuilder implements ComputerBuilder {
    private static final int MINIMUM_CAPACITY_GB = 1;

    private final ComputerType type;
    private String processor;
    private int memoryGb;
    private int storageGb;
    private String graphicsCard;
    private String operatingSystem;
    private final List<String> peripherals = new ArrayList<>();

    protected AbstractComputerBuilder(ComputerType type) {
        this.type = type;
    }

    @Override
    public ComputerBuilder processor(String processor) {
        this.processor = processor;
        return this;
    }

    @Override
    public ComputerBuilder memoryGb(int memoryGb) {
        this.memoryGb = memoryGb;
        return this;
    }

    @Override
    public ComputerBuilder storageGb(int storageGb) {
        this.storageGb = storageGb;
        return this;
    }

    @Override
    public ComputerBuilder graphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }

    @Override
    public ComputerBuilder operatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    @Override
    public ComputerBuilder addPeripheral(String peripheral) {
        peripherals.add(peripheral);
        return this;
    }

    @Override
    public final Computer build() {
        validateRequiredFields();
        validateSpecificConfiguration();
        return new Computer(
                type,
                processor,
                memoryGb,
                storageGb,
                graphicsCard,
                operatingSystem,
                peripherals
        );
    }

    protected void validateSpecificConfiguration() {
    }

    protected final int currentMemoryGb() {
        return memoryGb;
    }

    protected final String currentGraphicsCard() {
        return graphicsCard;
    }

    private void validateRequiredFields() {
        requireText(processor, "Processor");
        requirePositive(memoryGb, "Memory");
        requirePositive(storageGb, "Storage");
        requireText(graphicsCard, "Graphics card");
        requireText(operatingSystem, "Operating system");
        peripherals.forEach(peripheral -> requireText(peripheral, "Peripheral"));
    }

    private static void requireText(String value, String fieldName) {
        if (value == null || value.isBlank()) {
            throw new IllegalStateException(fieldName + " must be specified");
        }
    }

    private static void requirePositive(int value, String fieldName) {
        if (value < MINIMUM_CAPACITY_GB) {
            throw new IllegalStateException(fieldName + " must be at least 1 GB");
        }
    }
}
