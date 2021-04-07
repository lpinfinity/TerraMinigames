package dev.terra.pvparena.events;

import org.bukkit.Bukkit;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class enterarena implements Listener {

    @EventHandler
    public static void onPlayerWalk(PlayerMoveEvent event) {


        Player player = event.getPlayer();
        int x = player.getLocation().getBlockX();
        int y = player.getLocation().getBlockY();
        int z = player.getLocation().getBlockZ();

        if (x > 16 && x < 66) {
            if (z > -26 && z <33) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " wooden_sword");
            }
        }


    }
}

