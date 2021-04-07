package dev.terra.pvparena.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;


public class clearinventory implements Listener {

    @EventHandler
    public static void onPlayerDeath(PlayerDeathEvent event) {

        onPlayerDeath("clearinventory");

    }


}
