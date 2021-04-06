package dev.terra.pvparena;

import dev.terra.pvparena.events.welcomemessage;
import org.bukkit.ChatColor;
import dev.terra.pvparena.events.enterarena;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("TerraPVPArena has started");
    }

    @Override
    public void onDisable() {
        System.out.println("TerraPVPArena has stopped");
    }

}
