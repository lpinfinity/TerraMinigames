package dev.terra.pvparena;

import dev.terra.pvparena.events.Lobby;
import dev.terra.pvparena.events.clearinventory;
import dev.terra.pvparena.events.PlayerKillEvent;
import dev.terra.pvparena.events.welcomemessage;
import dev.terra.pvparena.events.enterarena;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public FileConfiguration config = getConfig();

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new enterarena(),this);
        getServer().getPluginManager().registerEvents(new welcomemessage(), this);
        getServer().getPluginManager().registerEvents(new PlayerKillEvent(this), this);
        getServer().getPluginManager().registerEvents(new clearinventory(),this);
        getServer().getPluginManager().registerEvents(new Lobby(),this);

        System.out.println("TerraPVPArena has started");
    }

    @Override
    public void onDisable() {
        System.out.println("TerraPVPArena has stopped");
    }

}
