package DeathArena.Handlers;

import DeathArena.Configs.ConfigUtils;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class SaveInventory {

    ConfigUtils CU = new ConfigUtils();

    public void saveInv(Player player, Plugin plugin) {
        YamlConfiguration playerConf = CU.getCConfig(player, plugin);
        playerConf.set("inventory.armor", player.getInventory().getArmorContents());
        playerConf.set("inventory.content", player.getInventory().getContents());
        CU.saveCConfig(player, playerConf, plugin);
        player.getInventory().clear();
        player.getInventory().setArmorContents(null);
    }

}
