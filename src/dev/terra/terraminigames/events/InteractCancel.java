package dev.terra.terraminigames.events;

import dev.terra.terraminigames.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractCancel implements Listener {

    private final Main main;

    public InteractCancel(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onPlayerInteractionEntity(PlayerInteractEntityEvent event) {
        if(main.config.getString("interact").equals("true")) {
            event.setCancelled(true);
        }

    }

    @EventHandler
    public void onPlayerInteractionAtEntity(PlayerInteractAtEntityEvent event) {
        if(main.config.getString("interact").equals("true")) {
            if(event.getRightClicked() != event.getPlayer())
                event.setCancelled(true);
        }
    }

    @EventHandler
    public void onPlayerInteraction(PlayerInteractEvent event) {
        if(main.config.getString("interact").equals("true")) {
            event.setCancelled(true);
        }
    }

}
