package DeathArena.Handlers;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class TeleportHandler {

    public static void teleport(Player player, World world, int x, int y, int z) {
        player.teleport(new Location(world, x + 0.5, y + 0.5, z + 0.5));
    }

}
