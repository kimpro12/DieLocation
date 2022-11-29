package me.dielocation;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Dielocation extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("[DieLocation] Plugin enabled");
        Bukkit.getPluginManager().registerEvents(new DieEvent(this), this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("[DieLocation] Plugin disabled");
    }
}
