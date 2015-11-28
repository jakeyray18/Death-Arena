package DeathArena.Commands;

import DeathArena.ItemStacks.ClassSelectorItems;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class ClassCommand implements CommandExecutor, Listener {

    private void openClassGUI(Player player) {
        Inventory gui = Bukkit.createInventory(null, 9, ChatColor.BLUE + "Select a class");

        gui.setItem(1, ClassSelectorItems.Tank());

        player.openInventory(gui);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {
        if (commandLabel.equalsIgnoreCase("class")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                openClassGUI(player);
                return true;
            }
        }
        return false;
    }

}
