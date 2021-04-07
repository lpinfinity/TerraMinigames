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
        if(event.getEntityType() == EntityType.PLAYER) {
            main.getTotalKills().set(event.getEntity().getPlayer().getUniqueId().toString(), main.getTotalKills().getString(event.getEntity().getPlayer().getUniqueId().toString() + 1));
            //main.getTotalKills().save("");
        }
    }

}
