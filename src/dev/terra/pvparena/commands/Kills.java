package dev.terra.pvparena.commands;

import dev.terra.pvparena.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

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
                if(args[0].equals(null)) {
                    player.sendMessage("You have " + main.config.getInt(player.getUniqueId().toString() + " kills."));
                }else{
                    player.sendMessage(args[0] + " has " + Bukkit.getServer().getPlayer(args[0]) + " kills.");
                }
            }else{
                System.out.println(args[0] + " has " + Bukkit.getServer().getPlayer(args[0]) + " kills.");
            }
        }

        return false;
    }
}
