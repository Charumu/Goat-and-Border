package com.charu.server.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class clearchatcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (!p.isOp()) {
                p.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            } else {
                for (int i = 0; i < 150; i++) {
                    Bukkit.broadcastMessage("\n");
                }
                Bukkit.broadcastMessage(ChatColor.GREEN + "Chat has been cleared!");
                p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
                return true;
            }
        }
        return false;
    }
}