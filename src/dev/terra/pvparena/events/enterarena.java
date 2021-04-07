package dev.terra.pvparena.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
<<<<<<< HEAD
=======
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
>>>>>>> 0341b8e7c5b10864d77944c4db3bc1bd92b539a1
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
<<<<<<< HEAD
=======
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.awt.*;
>>>>>>> 0341b8e7c5b10864d77944c4db3bc1bd92b539a1

public class enterarena implements Listener {

    @EventHandler
    public static void onPlayerWalk(PlayerMoveEvent event) {

<<<<<<< HEAD
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
=======


            Player player = event.getPlayer();
            int x = player.getLocation().getBlockX();
            int y = player.getLocation().getBlockY();
            int z = player.getLocation().getBlockZ();

            if (x > 16 && x < 66) {
                if (z > -26 && z <33) {
                    player.getInventory().setItem(0, new ItemStack(Material.WOODEN_SWORD, 1));
                }
            }

        }

    }
>>>>>>> 0341b8e7c5b10864d77944c4db3bc1bd92b539a1
