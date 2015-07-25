package DeathArena.ItemStacks;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Jakey on 16/7/2015.
 */
public class TankItems {

    public static ItemStack Prot2DiamondHelm() {
        ItemStack helm = new ItemStack(Material.DIAMOND_HELMET, 1);
        helm.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        return helm;
    }

    public static ItemStack Prot2DiamondChest() {
        ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        return chest;
    }

    public static ItemStack Prot2DiamondLegs() {
        ItemStack legs = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        legs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        return legs;
    }

    public static ItemStack Prot2DiamondBoots() {
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS, 1);
        boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        return boots;
    }

    public static ItemStack TankSword() {
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        sword.addEnchantment(Enchantment.DAMAGE_UNDEAD, 2);
        sword.addEnchantment(Enchantment.DAMAGE_ALL, 4);

        return sword;
    }

    public static ItemStack TankFood() {
        ItemStack food = new ItemStack(Material.COOKED_BEEF, 32);

        return food;
    }
}
