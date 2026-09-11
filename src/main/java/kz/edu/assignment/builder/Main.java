package kz.edu.assignment.builder;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        Computer studyComputer = director.createStudySetup();
        Computer gamingComputer = director.createGamingSetup();
        Computer customGamingComputer = new GamingComputerBuilder()
                .memoryGb(64)
                .storageGb(2_000)
                .addPeripheral("Racing wheel")
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

