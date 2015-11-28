package DeathArena.Handlers;

import DeathArena.ItemStacks.TankItems;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class GiveClassItems {

    SaveInventory save = new SaveInventory();

    public void giveTankItems(Player player, Plugin plugin) {

        save.saveInv(player, plugin);
        player.getInventory().setHelmet(TankItems.Prot2DiamondHelm());
        player.getInventory().setChestplate(TankItems.Prot2DiamondChest());
        player.getInventory().setLeggings(TankItems.Prot2DiamondLegs());
        player.getInventory().setBoots(TankItems.Prot2DiamondBoots());
        player.getInventory().addItem(TankItems.TankSword());
        player.getInventory().addItem(TankItems.TankFood());

    }

}
