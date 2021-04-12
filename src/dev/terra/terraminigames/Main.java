package dev.terra.terraminigames;

import dev.terra.terraminigames.commands.Kills;
import dev.terra.terraminigames.events.*;
import org.bukkit.ChatColor;
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

        System.out.println(ChatColor.GREEN "TerraPVPArena has started");
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.RED "TerraPVPArena has stopped");
    }

}
