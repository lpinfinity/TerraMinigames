package dev.terra.terraminigames.events;

import dev.terra.terraminigames.Main;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class PlayerKillEvent implements Listener {

    private final Main main;

    public PlayerKillEvent(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onPlayerKill(PlayerDeathEvent event) {
        if(event.getEntityType().equals(EntityType.PLAYER)) {
            if(main.config.getString(Objects.requireNonNull(event.getEntity().getKiller()).getUniqueId().toString()) == null) {
                main.config.addDefault(event.getEntity().getKiller().getUniqueId().toString(), 1);
                System.out.println("Data for " + event.getEntity().getKiller().getUniqueId().toString() + " does not exist, creating entry now.");
                main.config.options().copyDefaults(true);
            }else {
                main.config.set(event.getEntity().getKiller().getUniqueId().toString(), Integer.parseInt(Objects.requireNonNull(main.config.getString(event.getEntity().getKiller().getUniqueId().toString()))) + 1);
                System.out.println(event.getEntity().getKiller().getUniqueId().toString());
            }
            main.saveConfig();
            Objects.requireNonNull(event.getEntity().getKiller().getPlayer()).addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 2));
            System.out.println(Objects.requireNonNull(Objects.requireNonNull(event.getEntity().getKiller()).getPlayer()).getName());
            //Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "money give " + event.getEntity().getPlayer().getKiller().getPlayer() + " 2");
            // TODO: 4/9/2021  activate line 36 before server launch

        }
    }

}
