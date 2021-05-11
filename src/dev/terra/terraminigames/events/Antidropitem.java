package dev.terra.terraminigames.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class Antidropitem implements Listener {

    @EventHandler
    public void onItemDrop(PlayerDropItemEvent e) {

        e.setCancelled(true);

    }

}
