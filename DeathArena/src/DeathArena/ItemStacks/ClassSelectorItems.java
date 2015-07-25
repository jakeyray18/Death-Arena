package DeathArena.ItemStacks;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Created by Jakey on 19/7/2015.
 */
public class ClassSelectorItems {

    public static ItemStack Tank() {
        ItemStack tank = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta tankMeta = tank.getItemMeta();
        tankMeta.setDisplayName(ChatColor.RED + "Tank");
        tank.setItemMeta(tankMeta);
        tank.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        return tank;
    }
}