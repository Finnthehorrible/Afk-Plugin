package de.Finnthehorrible.github.afk;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Plugin implements CommandExecutor, Listener {
    private Location location;

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = null;
        if(sender instanceof Player){
            p = (Player)sender;

        }
        if(cmd.getName().equalsIgnoreCase("afk")){
            for (Player a : Bukkit.getOnlinePlayers()) {
                if(p != null) {
                    a.sendMessage(ChatColor.DARK_BLUE + p.getName() + ChatColor.BLUE + "ist nun AFK(AwayFromKeyBord");
                    p.getWorld().playEffect(p.getLocation(), Effect.ENDER_SIGNAL, 3);
                } else {
                    a.sendMessage(ChatColor.DARK_BLUE + p.getName() + ChatColor.BLUE + "ist nun wieder da!");
                }
            }
        }
        return false;
    }
}
