package behaviourPatterns.commandPattern.homeAppliance;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Lights lights = new Lights();
        Fan tableFan = new Fan();
        Fan phillipsFan = new Fan();

        FanOffCommand fanOffCommand = new FanOffCommand(phillipsFan);

        FanOnCommand fanOnCommand = new FanOnCommand(tableFan);

        LightsOnCommand lightsOnCommand = new LightsOnCommand(lights);
        LightsOffCommand lightsOffCommand = new LightsOffCommand(lights);

        CommandExecutioner commandExecutioner = new CommandExecutioner();

        commandExecutioner.registerCommand(fanOffCommand);
        commandExecutioner.registerCommand(fanOnCommand);
        commandExecutioner.registerCommand(lightsOnCommand);
        commandExecutioner.registerCommand(lightsOffCommand);
        commandExecutioner.registerCommand(fanOffCommand);

        commandExecutioner.executeCommands();
    }
}
