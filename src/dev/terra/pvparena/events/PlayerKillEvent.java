package dev.terra.pvparena.events;

import dev.terra.pvparena.Main;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerKillEvent implements Listener {

    private final Main main;

    public PlayerKillEvent(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onPlayerKill(PlayerDeathEvent event) {
        if(event.getEntityType().equals(EntityType.PLAYER)) {
            main.config.set(event.getEntity().getUniqueId().toString(), main.config.get(event.getEntity().getUniqueId().toString() + 1));
        }
    }

}
