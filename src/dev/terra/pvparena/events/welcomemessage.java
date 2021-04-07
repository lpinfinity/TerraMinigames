package dev.terra.pvparena.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
<<<<<<< HEAD
=======
import org.bukkit.inventory.Inventory;
>>>>>>> 0341b8e7c5b10864d77944c4db3bc1bd92b539a1

import java.net.http.WebSocket;

public class welcomemessage implements Listener {

    @EventHandler
    public static void  onPlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        player.sendMessage(ChatColor.GREEN + "Welcome to the Terra Minegames Server" );
        player.sendMessage(ChatColor.GREEN + "Step on pressure plates next to Minegames to join" );
        player.sendMessage(ChatColor.GREEN + "Do /hub to Teleport to the hub" );

    }

}
