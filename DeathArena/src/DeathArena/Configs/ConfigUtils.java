package DeathArena.Configs;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ConfigUtils {

    public void setCConfig(Player player, Plugin plugin) {

        String filename = player.getUniqueId().toString();
        File playerConfig = new File(plugin.getDataFolder() + File.separator + "/users/" + filename + ".yml");

        if (!playerConfig.exists()) {
            YamlConfiguration yamlPlayerConfig = YamlConfiguration.loadConfiguration(playerConfig);
            yamlPlayerConfig.addDefault("PlayerName", player.getName());
            yamlPlayerConfig.options().copyDefaults(true);
            try{
                yamlPlayerConfig.save(playerConfig);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public void reloadCConfig(Player player, Plugin plugin) {

        String filename = player.getUniqueId().toString();

        File playerConfig = new File(plugin.getDataFolder() + File.separator + "/users/" + filename + ".yml");
        if (playerConfig.exists()) {
            YamlConfiguration yamlPlayerConfig = YamlConfiguration.loadConfiguration(playerConfig);
        }

    }


    public YamlConfiguration getCConfig(Player player, Plugin plugin) {

        String filename = player.getUniqueId().toString();
        String name = player.getName();
        YamlConfiguration yamlPlayerConfig = null;

        File playerConfig = new File(plugin.getDataFolder() + File.separator + "/users/" + filename + ".yml");
        if (playerConfig.exists()) {
            yamlPlayerConfig = YamlConfiguration.loadConfiguration(playerConfig);
            if (!yamlPlayerConfig.get("PlayerName").toString().equals(name)) {
                yamlPlayerConfig.set("PlayerName", name);
                saveCConfig(player, yamlPlayerConfig, plugin);
            }
            reloadCConfig(player, plugin);
        }
        return yamlPlayerConfig;
    }

    public void saveCConfig(Player player,YamlConfiguration config,  Plugin plugin) {

        String filename = player.getUniqueId().toString();
        File playerConfig = new File(plugin.getDataFolder() + File.separator + "/users/" + filename + ".yml");

        try {
            config.save(playerConfig);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
