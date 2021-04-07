package dev.terra.pvparena.events;

import org.bukkit.Bukkit;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class enterarena implements Listener {

    @EventHandler
    public static void onPlayerWalk(PlayerMoveEvent event) {


        Player player = event.getPlayer();
        int x = player.getLocation().getBlockX();
        int y = player.getLocation().getBlockY();
        int z = player.getLocation().getBlockZ();

        if (x > 16 && x < 66) {
            if (z > -26 && z <33) {
                player.getInventory().setItem(0, new ItemStack(Material.WOODEN_SWORD,1));
                player.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
                player.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
                player.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
                player.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
            }
        }

    }
}

