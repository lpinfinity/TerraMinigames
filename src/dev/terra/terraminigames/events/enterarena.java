package dev.terra.terraminigames.events;

import com.SirBlobman.combatlogx.api.ICombatLogX;
import com.SirBlobman.combatlogx.api.utility.ICombatManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class enterarena implements Listener {

    @EventHandler
    public static void onPlayerWalk(PlayerMoveEvent event) {


        Player player = event.getPlayer();
        int x = player.getLocation().getBlockX();
        int y = player.getLocation().getBlockY();
        int z = player.getLocation().getBlockZ();

        if (x == 16 && z >= -2 && z <= 3) {

                player.getInventory().setItem(0, new ItemStack(Material.WOODEN_SWORD,1));
                player.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
                player.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
                player.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
                player.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));

                ICombatLogX plugin = (ICombatLogX) Bukkit.getPluginManager().getPlugin("CombatLogX");
            assert plugin != null;
            ICombatManager combatManager = plugin.getCombatManager();
                if(combatManager.isInCombat(player)) {
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp " + player.getName() + " 34.5 8 0.5");
                }

        }


        if (x == 14 && z >= -2 && z<= 3) {

            Objects.requireNonNull(event.getPlayer()).getInventory().clear();

        }
    }
}

