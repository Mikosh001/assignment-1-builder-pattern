package kz.edu.assignment.builder;

public final class ComputerDirector {
    private static final String WEBCAM = "Webcam";
    private static final String HEADSET = "Headset";
    private static final String GAMING_MOUSE = "Gaming mouse";
    private static final String MECHANICAL_KEYBOARD = "Mechanical keyboard";

    public Computer createStudySetup() {
        return new StudyComputerBuilder()
                .addPeripheral(WEBCAM)
                .addPeripheral(HEADSET)
                .build();
    }

    public Computer createGamingSetup() {
        return new GamingComputerBuilder()
                .addPeripheral(GAMING_MOUSE)
                .addPeripheral(MECHANICAL_KEYBOARD)
                .build();
    }
}

