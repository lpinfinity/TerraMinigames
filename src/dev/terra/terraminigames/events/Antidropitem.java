package dev.terra.terraminigames.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Antidropitem extends JavaPlugin {

    @EventHandler
    public void onItemDrop(PlayerDropItemEvent e) {

        e.setCancelled(true);

    }

}
