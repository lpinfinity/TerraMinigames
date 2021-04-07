package dev.terra.pvparena;

import dev.terra.pvparena.events.PlayerKillEvent;
import dev.terra.pvparena.events.welcomemessage;
import dev.terra.pvparena.events.enterarena;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new enterarena(),this);
        getServer().getPluginManager().registerEvents(new welcomemessage(), this);
        getServer().getPluginManager().registerEvents(new PlayerKillEvent(), this);
        System.out.println("TerraPVPArena has started");
    }

    @Override
    public void onDisable() {
        System.out.println("TerraPVPArena has stopped");
    }

}
