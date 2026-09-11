package builder;

public final class Main {
    private static final int CUSTOM_MEMORY_GB = 64;
    private static final int CUSTOM_STORAGE_GB = 2_000;
    private static final String RACING_WHEEL = "Racing wheel";

    private Main() {
    }

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        Computer studyComputer = director.createStudySetup();
        Computer gamingComputer = director.createGamingSetup();
        Computer customGamingComputer = new GamingComputerBuilder()
                .memoryGb(CUSTOM_MEMORY_GB)
                .storageGb(CUSTOM_STORAGE_GB)
                .addPeripheral(RACING_WHEEL)
                .build();

        printComputer("Study setup", studyComputer);
        printComputer("Gaming setup", gamingComputer);
        printComputer("Custom gaming setup", customGamingComputer);
    }

    private static void printComputer(String title, Computer computer) {
        System.out.println(title + ":");
        System.out.println(computer);
        System.out.println();
    }
}
