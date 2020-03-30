package behaviourPatterns.commandPattern.homeAppliance;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutioner {
    private List<Command> commands;

    public CommandExecutioner() {
        this.commands = new ArrayList<>();
    }

    public void registerCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands(){
        commands.forEach(Command::execute);
        commands.clear();
    }
}
