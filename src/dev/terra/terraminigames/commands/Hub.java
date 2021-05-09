package dev.terra.terraminigames.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Hub implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(command.getName().equalsIgnoreCase("hub")) {
                try {
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp " + player.getName() + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getX() + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getY() + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getZ());
                } catch (Exception e) {

                }
            }else if(command.getName().equalsIgnoreCase("lobby")) {
                try {
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tp " + player.getName() + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getX() + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getY() + " " + Bukkit.getServer().getWorld("world").getSpawnLocation().getZ());
                } catch (Exception e) {

                }
            }
        }

        return false;
    }

}
