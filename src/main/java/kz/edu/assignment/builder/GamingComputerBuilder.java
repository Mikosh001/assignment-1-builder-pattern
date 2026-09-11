package kz.edu.assignment.builder;

public final class GamingComputerBuilder extends AbstractComputerBuilder {
    private static final String DEFAULT_PROCESSOR = "AMD Ryzen 7";
    private static final int DEFAULT_MEMORY_GB = 32;
    private static final int DEFAULT_STORAGE_GB = 1_000;
    private static final String DEFAULT_GRAPHICS = "NVIDIA GeForce RTX 4070";
    private static final String DEFAULT_OS = "Windows 11 Home";
    private static final int MINIMUM_GAMING_MEMORY_GB = 16;
    private static final String INTEGRATED_GRAPHICS = "Integrated graphics";

    public GamingComputerBuilder() {
        super(ComputerType.GAMING);
        processor(DEFAULT_PROCESSOR)
                .memoryGb(DEFAULT_MEMORY_GB)
                .storageGb(DEFAULT_STORAGE_GB)
                .graphicsCard(DEFAULT_GRAPHICS)
                .operatingSystem(DEFAULT_OS);
    }

    @Override
    protected void validateSpecificConfiguration() {
        if (currentMemoryGb() < MINIMUM_GAMING_MEMORY_GB) {
            throw new IllegalStateException("Gaming computer requires at least 16 GB of memory");
        }
        if (INTEGRATED_GRAPHICS.equalsIgnoreCase(currentGraphicsCard())) {
            throw new IllegalStateException("Gaming computer requires a dedicated graphics card");
        }
    }
}

