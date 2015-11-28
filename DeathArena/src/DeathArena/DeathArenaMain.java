package DeathArena;

import DeathArena.Commands.ClassCommand;
import DeathArena.Commands.ConfigTest;
import DeathArena.Commands.InventorySaveTest;
import DeathArena.Commands.ReloadArena;
import DeathArena.Configs.ConfigUtils;
import DeathArena.Handlers.ResetWorldHandler;
import DeathArena.Listeners.ClassSelectorClickListener;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathArenaMain extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        registerCommands();
        registerListeners();
        ResetWorldHandler.startArenaWorld(getConfig().getString("ArenaWorld"), this);

    }

    public void onDisable() {
        ResetWorldHandler.unloadMap(getConfig().getString("ArenaWorld"), this);
    }

    public void registerListeners() {

        new ClassSelectorClickListener(this);

    }

    private void registerCommands() {

        getCommand("class").setExecutor(new ClassCommand());
        getCommand("saveplayer").setExecutor(new ConfigTest(this));
        getCommand("loadedit").setExecutor(new ConfigTest(this));
        getCommand("saveinv").setExecutor(new InventorySaveTest(this));
        getCommand("restoreinv").setExecutor(new InventorySaveTest(this));
        getCommand("reloadArena").setExecutor(new ReloadArena(this));

    }
}