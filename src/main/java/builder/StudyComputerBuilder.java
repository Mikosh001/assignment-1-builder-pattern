package builder;

public final class StudyComputerBuilder extends AbstractComputerBuilder {
    private static final String DEFAULT_PROCESSOR = "Intel Core i5";
    private static final int DEFAULT_MEMORY_GB = 16;
    private static final int DEFAULT_STORAGE_GB = 512;
    private static final String DEFAULT_GRAPHICS = "Integrated graphics";
    private static final String DEFAULT_OS = "Windows 11 Education";

    public StudyComputerBuilder() {
        super(ComputerType.STUDY);
        processor(DEFAULT_PROCESSOR)
                .memoryGb(DEFAULT_MEMORY_GB)
                .storageGb(DEFAULT_STORAGE_GB)
                .graphicsCard(DEFAULT_GRAPHICS)
                .operatingSystem(DEFAULT_OS);
    }
}
