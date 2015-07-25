package DeathArena.Handlers;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

/**
 * Created by Jakey on 19/7/2015.
 */
public class TeleportHandler {

    public static void teleport(Player player, World world, int x, int y, int z) {
        player.teleport(new Location(world, x, y, z));
    }

}
