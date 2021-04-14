package dev.terra.terraminigames.files;

import dev.terra.terraminigames.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;

public class PlayerKillsManager {

    private Main plugin;
    private FileConfiguration playerKillsConfig = null;
    private File configFile = null;

    public PlayerKillsManager(Main plugin) {
        this.plugin = plugin;
        saveDefaultConfig();
    }

    public void reloadConfig() {
        if(this.configFile == null)
            this.configFile = new File(this.plugin.getDataFolder(), "playerKills.yml");

        this.playerKillsConfig = YamlConfiguration.loadConfiguration(this.configFile);

        InputStream defaultStream = this.plugin.getResource("playerKills.yml");

        if(defaultStream != null) {
            YamlConfiguration defaultConfig = YamlConfiguration.loadConfiguration(new InputStreamReader(defaultStream));
            this.playerKillsConfig.setDefaults(defaultConfig);
        }

    }

    public FileConfiguration getConfig() {
        if(this.playerKillsConfig == null)
            reloadConfig();
        return this.playerKillsConfig;
    }

    public void saveConfig() {
        if(this.playerKillsConfig == null || this.configFile == null)
            return;

        try {
            this.getConfig().save(this.configFile);
        } catch (IOException e) {
            this.plugin.getLogger().log(Level.SEVERE, "Could not save playerKills.yml to " + this.configFile, e);
        }
    }

    public void saveDefaultConfig() {
        if(this.configFile == null)
            this.configFile = new File(this.plugin.getDataFolder(), "playerKills.yml");

        if(!this.configFile.exists()) {
            this.plugin.saveResource("playerKills.yml", false);
        }
    }

}
