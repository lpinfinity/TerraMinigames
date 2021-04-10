package dev.terra.pvparena.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class Arena implements Listener {

    @EventHandler
    public static void EntityDamageByEntityEvent(EntityDamageByEntityEvent event) {

        Entity entity = event.getEntity();
        int x = entity.getLocation().getBlockX();
        int y = entity.getLocation().getBlockY();
        int z = entity.getLocation().getBlockZ();


        if (event.getCause() == EntityDamageByEntityEvent.DamageCause.ENTITY_ATTACK){

            if (x == 16 && y == 8 && z >= -2 && z <= 3){

                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp" + event.getEntity().getName() + "35 8 0");


            }


        }

    }

}
