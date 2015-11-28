package DeathArena.ItemStacks;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class TankItems {

    List<ItemStack> tankList;

    public List<ItemStack> getTankList() {
        tankList.add(Prot2DiamondBoots());
        tankList.add(Prot2DiamondLegs());
        tankList.add(Prot2DiamondChest());
        tankList.add(Prot2DiamondHelm());
        tankList.add(TankSword());
        tankList.add(TankFood());
        return tankList;
    }

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

        return new ItemStack(Material.COOKED_BEEF, 32);
    }
}
