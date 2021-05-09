package dev.terra.terraminigames.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Item;
import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractCancel implements Listener {

    NamespacedKey namespacedKey = NamespacedKey.minecraft("item_frame");

    @EventHandler
    public void onPlayerInteraction(PlayerInteractEntityEvent event) {

        event.setCancelled(true);

    }

}
