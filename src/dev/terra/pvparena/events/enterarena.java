package dev.terra.pvparena.events;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.awt.*;

public class enterarena implements Listener {

    @EventHandler
    public static void onPlayerWalk(PlayerMoveEvent event) {



            Player player = event.getPlayer();
            int x = player.getLocation().getBlockX();
            int y = player.getLocation().getBlockY();
            int z = player.getLocation().getBlockZ();

            if (x > 16 && x < 66) {
                if (z > -26 && z <33) {
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "replaceitem " + "Entity" + player.getName() + "Container(0)" + " wooden_sword");
                }
            }

        }

    }
