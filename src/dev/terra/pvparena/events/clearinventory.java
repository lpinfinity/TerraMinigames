package dev.terra.pvparena.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.Objects;


public class clearinventory implements Listener {

    @EventHandler
    public static void onPlayerDeath(PlayerDeathEvent event) {


        Objects.requireNonNull(event.getEntity().getPlayer()).getInventory().clear();


    }


}
