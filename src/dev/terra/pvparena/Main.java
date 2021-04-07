package dev.terra.pvparena;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import dev.terra.pvparena.events.welcomemessage;
import org.bukkit.ChatColor;
import dev.terra.pvparena.events.enterarena;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class Main extends JavaPlugin {

    private File totalKillsFile;
    private FileConfiguration totalKills;

    @Override
    public void onEnable() {
<<<<<<< HEAD
        getServer().getPluginManager().registerEvents(new enterarena(),this);
        getServer().getPluginManager().registerEvents(new welcomemessage(), this);
=======
        createTotalKills();
>>>>>>> a97d64d652110147d7117d8c900ba8f1c47fab74
        System.out.println("TerraPVPArena has started");
    }

    @Override
    public void onDisable() {
        System.out.println("TerraPVPArena has stopped");
    }

    public FileConfiguration getTotalKills() {
        return this.totalKills;
    }

    private void createTotalKills() {
        totalKillsFile = new File(getDataFolder(), "totalKills.yml");
        if(!totalKillsFile.exists()) {
            totalKillsFile.getParentFile().mkdirs();
            saveResource("totalKills.yml", false);
        }
        totalKills = new YamlConfiguration();
        try {
            totalKills.load(totalKillsFile);
        }catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

}
