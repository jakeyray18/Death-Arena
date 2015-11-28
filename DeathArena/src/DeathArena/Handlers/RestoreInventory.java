package DeathArena.Handlers;


import DeathArena.Configs.ConfigUtils;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import java.util.List;

public class RestoreInventory {

    ConfigUtils CU = new ConfigUtils();

    public void restoreInv(Player player, Plugin plugin) {
        YamlConfiguration playerConf = CU.getCConfig(player, plugin);
        player.getInventory().clear();
        player.getInventory().setArmorContents(null);
        ItemStack[] content;

        content = ((List<ItemStack>) playerConf.get("inventory.armor") ).toArray(new ItemStack[0]);
        player.getInventory().setArmorContents(content);
        playerConf.set("inventory.armor", null);
        content = ((List<ItemStack>) playerConf.get("inventory.content")).toArray(new ItemStack[0]);
        player.getInventory().setContents(content);
        playerConf.set("inventory.content", null);
        CU.saveCConfig(player, playerConf, plugin);
    }

}
