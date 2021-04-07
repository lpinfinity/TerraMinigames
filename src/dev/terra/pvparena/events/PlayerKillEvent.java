package dev.terra.pvparena.events;

import dev.terra.pvparena.Main;
import org.bukkit.event.Listener;

public class PlayerKillEvent implements Listener {

    private final Main main;

    public PlayerKillEvent(Main main) {
        this.main = main;
    }
}
