package dev.terra.pvparena.events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.Objects;

public class Lobby implements Listener {

    @EventHandler
    public static void onPlayerDamage(EntityDamageEvent event) {

        if (event.getEntity() instanceof Player) {

            Player player = (Player) event.getEntity();
            if (player.isFlying() || player.getAllowFlight()) {

                player.setFlying(false);
                player.setAllowFlight(false);
                player.setFallDistance(0);

            }

        }

    }
}














