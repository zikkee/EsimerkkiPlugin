package me.nikke.esimerkkiplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PingCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("ping")) {
            Player player = (Player) sender;
            player.sendMessage("§aPong!");
        }
        return false;
    }
}