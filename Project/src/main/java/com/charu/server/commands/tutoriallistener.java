package com.charu.server.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.net.http.WebSocket;

public class tutoriallistener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getView().getTitle().equals(net.md_5.bungee.api.ChatColor.of("#ffdcf7") + "" + ChatColor.BOLD + "Tutorial")
                && e.getCurrentItem() != null) {
            e.setCancelled(true);
            Player p = (Player) e.getWhoClicked();
        }
    }
}
