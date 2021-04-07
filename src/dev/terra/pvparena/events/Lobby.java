package dev.terra.pvparena.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.Objects;

public class Lobby implements Listener {

    @EventHandler
    public static void onPlayerWalk(PlayerMoveEvent event) {

        Player player = event.getPlayer();
        int x = player.getLocation().getBlockX();
        int y = player.getLocation().getBlockY();
        int z = player.getLocation().getBlockZ();

        if (x > -30 && x < 14) {
            if (z > -50 && z < 50) {

                Objects.requireNonNull(event.getPlayer()).getInventory().clear();
            }


        }

    }

}



