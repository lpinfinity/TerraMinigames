package dev.terra.pvparena.events;

import dev.terra.pvparena.Main;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Collection;
import java.util.Objects;

public class PlayerKillEvent implements Listener {

    private final Main main;

    public PlayerKillEvent(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onPlayerKill(PlayerDeathEvent event) {
        if(event.getEntityType().equals(EntityType.PLAYER)) {
            if(main.config.getString(event.getEntity().getUniqueId().toString()) == null) {
                main.config.addDefault(event.getEntity().getUniqueId().toString(), 1);
                System.out.println("does not exist, creating for " + event.getEntity().getUniqueId().toString());
                main.config.options().copyDefaults(true);
                main.saveConfig();
            }else {
                main.config.set(event.getEntity().getUniqueId().toString(), Integer.parseInt(Objects.requireNonNull(main.config.getString(event.getEntity().getUniqueId().toString()))) + 1);
                System.out.println(event.getEntity().getUniqueId().toString());
                main.saveConfig();
            }
            Objects.requireNonNull(event.getEntity().getPlayer()).addPotionEffects((Collection<PotionEffect>) new PotionEffect(PotionEffectType.REGENERATION, 5, 2));
        }
    }

}
