# Assignment #1 - Builder Pattern

This project demonstrates the Builder creational design pattern by constructing an immutable `Computer` product step by step.

The two concrete builders create meaningfully different representations:

- `StudyComputerBuilder` creates a balanced study configuration with integrated graphics.
- `GamingComputerBuilder` creates a high-performance configuration and validates gaming-specific requirements.

`ComputerDirector` assembles reusable study and gaming setups. `Main` also shows direct fluent customization without the Director.

## Project structure

```text
src/main/java/kz/edu/assignment/builder/
  Computer.java                 Product
  ComputerBuilder.java          Builder interface
  AbstractComputerBuilder.java  Shared construction and validation
  StudyComputerBuilder.java     ConcreteBuilder 1
  GamingComputerBuilder.java    ConcreteBuilder 2
  ComputerDirector.java         Director
  Main.java                     Client/demo
uml/
  builder-pattern.puml          PlantUML source
```

## Requirements

- JDK 17 or newer

## Compile and run

From the repository root in PowerShell:

```powershell
New-Item -ItemType Directory -Force out/main | Out-Null
$mainSources = Get-ChildItem src/main/java -Recurse -Filter *.java
javac --release 17 -d out/main $mainSources
java -cp out/main kz.edu.assignment.builder.Main
```

Expected demo: a study setup, a gaming setup, and a customized gaming setup are printed.

## Build each representation directly

```java
Computer studyComputer = new StudyComputerBuilder().build();

Computer gamingComputer = new GamingComputerBuilder()
        .memoryGb(64)
        .storageGb(2_000)
        .build();
```

The same builders can be used through the reusable Director presets:

```java
ComputerDirector director = new ComputerDirector();
Computer studySetup = director.createStudySetup();
Computer gamingSetup = director.createGamingSetup();
```
