package dev.terra.pvparena.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;

public class ToolsNoDamage implements Listener {

    @EventHandler
    public void onItemDamage(PlayerItemDamageEvent event){

        event.setCancelled(true);

    }

}
