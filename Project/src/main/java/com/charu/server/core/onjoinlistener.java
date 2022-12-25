package com.charu.server.core;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class onjoinlistener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (!p.hasPlayedBefore()) {
            p.sendMessage(ChatColor.of("#ffdcf7") + "\n⚔" + ChatColor.DARK_GRAY + " | " + ChatColor.of("#ffdcf7") + "ᴡᴇʟᴄᴏᴍᴇ ᴛᴏ" + ChatColor.BOLD + " ɢᴏᴀᴛ" + ChatColor.of("#ffdcf7") + "!" + ChatColor.GRAY + "\n\n     This server is my unique take on Minecraft survival inside" +  "\n\n     a border." + "\n     Please read the " + ChatColor.of("#ffdcf7") + "Tutorial " + ChatColor.GRAY + "by doing /tutorial to get started! " + "\n\n     Join our" + ChatColor.of("#7289da") + " Discord" + ChatColor.GRAY + " for more information." + ChatColor.of("#ffdcf7") + "\n     Enjoy your stay! ❤\n\n ");
            p.getInventory().setItem(0, new ItemStack(Material.WOODEN_SWORD));
            p.getInventory().setItem(1, new ItemStack(Material.WOODEN_PICKAXE));
            p.getInventory().setItem(2, new ItemStack(Material.WOODEN_AXE));
            p.getInventory().setItem(3, new ItemStack(Material.WOODEN_SHOVEL));
        } else {
            p.sendMessage(ChatColor.of("#ffdcf7") + "\n⚔" + ChatColor.DARK_GRAY + " | " + ChatColor.of("#ffdcf7") + "ᴡᴇʟᴄᴏᴍᴇ ʙᴀᴄᴋ ᴛᴏ" + ChatColor.BOLD + "ɢᴏᴀᴛ!" + ChatColor.GRAY + "\n\n     Welcome back " + ChatColor.of("#ffdcf7") + p.getName() + ChatColor.GRAY + "!" + ChatColor.of("#ffdcf7") + "\n     We hope you enjoy your stay! ❤\n\n ");
        }
    }
}