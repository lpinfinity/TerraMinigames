package dev.terra.terraminigames.commands;

import dev.terra.terraminigames.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class Kills implements CommandExecutor {

    private final Main main;

    public Kills(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(command.getName().equalsIgnoreCase("kills")) {
                if(args[0].equals("")) {
                    player.sendMessage("You have " + main.playerKills.getConfig().getInt("players." + (Objects.requireNonNull(((Player) sender).getPlayer()).getUniqueId().toString()) + ".kills") + " kills.");
                }else{
                    player.sendMessage(args[0] + " has " + main.playerKills.getConfig().getInt("players." + (Objects.requireNonNull(Bukkit.getPlayer(args[0])).getUniqueId().toString()) + ".kills") + " kills.");
                }
            }else{
                System.out.println(args[0] + " has " + main.playerKills.getConfig().getInt("players." + (Objects.requireNonNull(Bukkit.getPlayer(args[0])).getUniqueId().toString()) + ".kills") + " kills.");
            }
        }

        return false;
    }
}
