package dev.terra.terraminigames.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Objects;

public class welcomemessage implements Listener {

    @EventHandler
    public static void  onPlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        player.sendMessage(ChatColor.GREEN + "Welcome to the Terra Minegames Server" );
        player.sendMessage(ChatColor.GREEN + "Step on pressure plates next to Minegames to join" );
        player.sendMessage(ChatColor.GREEN + "Do /hub to Teleport to the hub" );
        player.sendMessage(ChatColor.GREEN + "Do /SMP to teleport to the Terra SMP");

        Objects.requireNonNull(event.getPlayer()).getInventory().clear();

    }

}
