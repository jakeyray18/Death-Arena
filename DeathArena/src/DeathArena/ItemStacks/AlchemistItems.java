package DeathArena.ItemStacks;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Jakey on 16/7/2015.
 */
public class AlchemistItems {

    public static ItemStack Prot4Unb3LeatherHelm() {
        ItemStack helm = new ItemStack(Material.LEATHER_HELMET, 1);
        helm.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        helm.addEnchantment(Enchantment.DURABILITY, 3);

        return helm;
    }

    public static ItemStack Prot4Unb3LeatherChest() {
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        chest.addEnchantment(Enchantment.DURABILITY, 3);

        return chest;
    }

    public static ItemStack Prot4Unb3LeatherLegs() {
        ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        legs.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        legs.addEnchantment(Enchantment.DURABILITY, 3);

        return legs;
    }

    public static ItemStack Prot4Unb3LeatherBoots() {
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS, 1);
        boots.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        boots.addEnchantment(Enchantment.DURABILITY, 3);

        return boots;
    }

    public static ItemStack AlchemistSword() {
        ItemStack sword = new ItemStack(Material.WOOD_SWORD, 1);
        sword.addEnchantment(Enchantment.DAMAGE_ALL, 4);

        return sword;
    }

    public static ItemStack GodApple() {
        ItemStack apple = new ItemStack(Material.GOLDEN_APPLE, 4);
        apple.setDurability((short) 1);

        return apple;
    }
}
