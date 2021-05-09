package dev.terra.terraminigames;

import dev.terra.terraminigames.commands.Hub;
import dev.terra.terraminigames.commands.Kills;
import dev.terra.terraminigames.events.*;
import dev.terra.terraminigames.files.PlayerKillsManager;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Main extends JavaPlugin {

    public FileConfiguration config = getConfig();

    public PlayerKillsManager playerKills;

    @Override
    public void onEnable() {

        this.playerKills = new PlayerKillsManager(this);

        getServer().getPluginManager().registerEvents(new enterarena(),this);
        getServer().getPluginManager().registerEvents(new welcomemessage(), this);
        getServer().getPluginManager().registerEvents(new PlayerKillEvent(this), this);
        getServer().getPluginManager().registerEvents(new clearinventory(),this);
        getServer().getPluginManager().registerEvents(new Lobby(),this);
        getServer().getPluginManager().registerEvents(new ToolsNoDamage(),this);
        getServer().getPluginManager().registerEvents(new Arena(),this);

        Objects.requireNonNull(this.getCommand("kills")).setExecutor(new Kills(this));
        Objects.requireNonNull(this.getCommand("hub")).setExecutor(new Hub());
        Objects.requireNonNull(this.getCommand("lobby")).setExecutor(new Hub());

        System.out.println(ChatColor.GREEN +  "TerraMinigamesMain has started");
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.RED +  "TerraMinigamesMain has stopped");
    }

}
