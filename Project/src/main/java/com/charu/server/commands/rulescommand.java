package com.charu.server.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class rulescommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            p.sendMessage(ChatColor.DARK_GRAY + "                                    " + ChatColor.of("#ffdcf7") + "" + ChatColor.BOLD + "ʀᴜʟᴇꜱ" + "\n \n");
            p.sendMessage(ChatColor.GRAY + "1. " + ChatColor.of("#F0E68C") + "Absolutely no cheating in any way." + "\n" + ChatColor.GRAY + "2. " + ChatColor.of("#F0E68C") + "Be respectful to every player. Absolutely no toxicity, racism, sexism, homophobia and everything else in that matter." + "\n" + ChatColor.GRAY + "3. " + ChatColor.of("#F0E68C") + "Do not ask or beg for items, ranks, OP and anything of that sort. If you wish to get items, play the game. If you wish to get a rank, buy it and if you wish for OP apply for staff." + "\n \n" + ChatColor.of("#ffdcf7") + "Thank you for reading the rules, if you have any suggestions on how we could improve them, want to report someone for breaking them or anything of that sort, please open a ticket on the " + ChatColor.of("#7289da") + "Discord" + ChatColor.of("#ffdcf7") + ". " + ChatColor.of("#ffdcf7") + "❤");
            p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);
        }
        return false;
    }
} //#FF0099