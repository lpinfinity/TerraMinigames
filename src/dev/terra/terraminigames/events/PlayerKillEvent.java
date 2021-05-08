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
            if(main.playerKills.getConfig().getString(("players." + (Objects.requireNonNull(event.getEntity().getKiller())).getUniqueId().toString())) == null) {
                main.playerKills.getConfig().addDefault("players." + (event.getEntity().getKiller().getUniqueId().toString()) + ".kills", 1);
                main.playerKills.getConfig().addDefault("players." + (event.getEntity().getKiller().getUniqueId().toString()) + ".name", event.getEntity().getKiller().getName());
                System.out.println("Data for " + event.getEntity().getKiller().getUniqueId().toString() + " does not exist, creating entry now.");
                main.playerKills.getConfig().options().copyDefaults(true);
            }else {
                main.playerKills.getConfig().set("players." + (event.getEntity().getKiller().getUniqueId().toString()) + ".kills", Integer.parseInt(Objects.requireNonNull(main.playerKills.getConfig().getString("players." + (event.getEntity().getKiller().getUniqueId().toString()) + ".kills"))) + 1);
                System.out.println(event.getEntity().getKiller().getUniqueId().toString());

                if(!event.getEntity().getName().equals(main.playerKills.getConfig().getString(("players." + (Objects.requireNonNull(event.getEntity().getKiller())).getUniqueId().toString()))))
                    main.playerKills.getConfig().addDefault("players." + (event.getEntity().getKiller().getUniqueId().toString()) + ".name", event.getEntity().getKiller().getName());
            }
            main.playerKills.saveConfig();
            Objects.requireNonNull(event.getEntity().getKiller().getPlayer()).addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 2));
            System.out.println(Objects.requireNonNull(Objects.requireNonNull(event.getEntity().getKiller()).getPlayer()).getName());
            //Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "money give " + event.getEntity().getPlayer().getKiller().getPlayer() + " 2");
            // TODO: 4/9/2021  activate line 36 before server launch

        }
    }

}
