# Builder Pattern Assignment

This is a small Java project that shows the Builder pattern. The product is a
computer with a processor, memory, storage, graphics card, operating system and
peripherals.

There are two builders:

- `StudyComputerBuilder` creates a computer for study.
- `GamingComputerBuilder` creates a gaming computer.

`ComputerDirector` contains two ready configurations. A builder can also be used
directly when a custom computer is needed.

## Run the project

JDK 17 or newer is required. Run these commands from the project folder:

```powershell
New-Item -ItemType Directory -Force out/main | Out-Null
$mainSources = Get-ChildItem src/main/java -Recurse -Filter *.java
javac --release 17 -d out/main $mainSources
java -cp out/main builder.Main
```

## Example

```java
Computer studyComputer = new StudyComputerBuilder().build();

Computer gamingComputer = new GamingComputerBuilder()
        .memoryGb(64)
        .storageGb(2_000)
        .build();
```

The UML source is in `uml/builder-pattern.puml`. It can be opened with a
PlantUML plugin to view the class diagram.
