package DeathArena;

import DeathArena.Commands.ClassCommand;
import DeathArena.Listeners.ClassSelectorClickListener;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathArenaMain extends JavaPlugin {
    @Override
    public void onEnable() {
        registerCommands();
        registerListeners();
    }

    public void registerListeners() {
        new ClassSelectorClickListener(this);
    }

    private void registerCommands() {

        getCommand("class").setExecutor(new ClassCommand());

    }
}