package DeathArena;

import DeathArena.Commands.ClassCommand;
import DeathArena.Commands.ConfigTest;
import DeathArena.Configs.ConfigUtils;
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
        getCommand("saveplayer").setExecutor(new ConfigTest(this));
        getCommand("loadedit").setExecutor(new ConfigTest(this));

    }
}