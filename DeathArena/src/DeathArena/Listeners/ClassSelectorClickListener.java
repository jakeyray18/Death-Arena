package DeathArena.Listeners;

import DeathArena.DeathArenaMain;
import DeathArena.Handlers.TeleportHandler;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Created by Jakey on 19/7/2015.
 */
public class ClassSelectorClickListener implements Listener{

    DeathArenaMain plugin;
    public ClassSelectorClickListener(DeathArenaMain plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {

        if (!ChatColor.stripColor(event.getInventory().getName()).equalsIgnoreCase("Select a class")) {
            return;
        }
        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        if (event.getCurrentItem() == null || event.getCurrentItem().getType() == Material.AIR || !event.getCurrentItem().hasItemMeta()) {
            player.closeInventory();
            return;
        }

        switch (event.getCurrentItem().getType()) {
            case DIAMOND_CHESTPLATE:
                //Remember to change later
                TeleportHandler.teleport(player, player.getWorld(), -260, 70, 135);
        }

    }

}
