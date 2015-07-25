package DeathArena.ItemStacks;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Jakey on 16/7/2015.
 */
public class RangerItems {

    public static ItemStack Arrow() {
        ItemStack arrow = new ItemStack(Material.ARROW, 1);

        return arrow;
    }

    public static ItemStack Prot1LeatherHelm() {
        ItemStack helm = new ItemStack(Material.LEATHER_HELMET, 1);
        helm.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

        return helm;
    }

    public static ItemStack Prot1LeatherChest() {
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

        return chest;
    }

    public static ItemStack Prot1LeatherLegs() {
        ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        legs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

        return legs;
    }

    public static ItemStack Prot1LeatherBoots() {
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS, 1);
        boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);

        return boots;
    }

    public static ItemStack Bow() {
        ItemStack bow = new ItemStack(Material.BOW, 1);
        bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
        bow.addEnchantment(Enchantment.ARROW_DAMAGE, 5);
        bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 1);

        return bow;
    }

    public static ItemStack RangerFood() {
        ItemStack food = new ItemStack(Material.BREAD, 32);

        return food;
    }
}
