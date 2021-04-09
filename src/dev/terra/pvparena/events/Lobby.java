package dev.terra.pvparena.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class Lobby implements Listener {

    @EventHandler
    public static void onPlayerDamage(final EntityDamageEvent event) {

        if (event.getCause() == EntityDamageEvent.DamageCause.FALL) {

            event.setCancelled(true);

        }

    }
}














