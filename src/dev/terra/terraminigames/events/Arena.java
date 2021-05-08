package dev.terra.terraminigames.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Arena implements Listener {

    /*private static long[] time;

    @EventHandler
    public static void EntityDamageByEntityEvent(EntityDamageByEntityEvent event) {

        Entity entity = event.getEntity();
        int x = entity.getLocation().getBlockX();
        int y = entity.getLocation().getBlockY();
        int z = entity.getLocation().getBlockZ();

        if (event.getCause() == EntityDamageByEntityEvent.DamageCause.ENTITY_ATTACK){

            time[Integer.parseInt(event.getEntity().getName())] = System.currentTimeMillis();
            System.out.println(Integer.parseInt(event.getEntity().getName()));

            if (x == 16 && y == 8 && z >= -2 && z <= 3){

                if(time[Integer.parseInt(event.getEntity().getName())] < time[Integer.parseInt(event.getEntity().getName())] + 5000) {

                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp " + event.getEntity().getName() + " 35 8 0");

                }

            }

        }

    }*/

}
