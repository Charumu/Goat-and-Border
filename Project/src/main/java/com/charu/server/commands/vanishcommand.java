package com.charu.server.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class vanishcommand implements CommandExecutor {

    private List<UUID> vanished = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (!p.isOp()) {
                p.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            } else {
                if (vanished.contains(p.getUniqueId())) { // they are vanished
                    vanished.remove(p.getUniqueId());
                    for (Player target : Bukkit.getOnlinePlayers()) {
                        target.showPlayer(p);
                    }
                    p.sendMessage(ChatColor.GREEN + "You are no longer vanished!");
                } else { // they are not vanished
                    vanished.add(p.getUniqueId());
                    for (Player target : Bukkit.getOnlinePlayers()) {
                        target.hidePlayer(p);
                    }
                    p.sendMessage(ChatColor.GREEN + "You are vanished!");
                }
            }
        }
        return false;
    }
}