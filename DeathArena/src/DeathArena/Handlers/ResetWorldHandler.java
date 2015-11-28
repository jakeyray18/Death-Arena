package DeathArena.Handlers;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class ResetWorldHandler {

    public static void unloadMap(String mapname, Plugin plugin){
        if(Bukkit.getServer().unloadWorld(Bukkit.getServer().getWorld(mapname), false)){
            plugin.getLogger().info("Successfully unloaded " + mapname);
        }else{
            plugin.getLogger().severe("COULD NOT UNLOAD " + mapname);
        }
    }

    public static void loadMap(String mapname){
        World world = Bukkit.getServer().createWorld(new WorldCreator(mapname));
        world.setAutoSave(false);
    }

    public static void teleportPlayerOutOfWorld(String mapname, Plugin plugin) {
        if (Bukkit.getWorld(mapname).getPlayers() != null) {
            for (Player p : Bukkit.getWorld(mapname).getPlayers()) {
                World lobbyWorld = Bukkit.getWorld(plugin.getConfig().getString("LobbyWorld"));
                TeleportHandler.teleport(p, lobbyWorld, lobbyWorld.getSpawnLocation().getBlockX(), lobbyWorld.getSpawnLocation().getBlockY(), lobbyWorld.getSpawnLocation().getBlockZ());
            }
        }
    }

    public static void reloadWorld(String mapname, Plugin plugin){
        teleportPlayerOutOfWorld(mapname, plugin);
        unloadMap(mapname, plugin);
        loadMap(mapname);
    }

    public static void startArenaWorld(String mapname, Plugin plugin) {
        loadMap(mapname);
        reloadWorld(mapname, plugin);
    }

}
