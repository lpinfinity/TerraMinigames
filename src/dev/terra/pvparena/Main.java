package dev.terra.pvparena;

import dev.terra.pvparena.commands.Kills;
import dev.terra.pvparena.events.*;
import org.bukkit.configuration.file.FileConfiguration;
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
        getServer().getPluginManager().registerEvents(new ToolsNoDamage(),this);
        getServer().getPluginManager().registerEvents(new Arena(),this);

        this.getCommand("kills").setExecutor(new Kills(this));

        System.out.println("TerraPVPArena has started");
    }

    @Override
    public void onDisable() {
        System.out.println("TerraPVPArena has stopped");
    }

}
