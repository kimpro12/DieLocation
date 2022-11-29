package me.dielocation;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DieEvent implements Listener {
    private JavaPlugin plugin;
    public DieEvent(JavaPlugin plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void die(PlayerDeathEvent event) {
        Player p = event.getEntity();
        Location loc = p.getLocation();
        int x = (int) loc.getX();
        int y = (int) loc.getY();
        int z = (int) loc.getZ();
        String world = loc.getWorld().getName();
        p.sendMessage(ChatColor.AQUA + "[DieLocation] You were die at x: " + x + " y: " + y +" z:" + z + " World: " + world);
    }
}
