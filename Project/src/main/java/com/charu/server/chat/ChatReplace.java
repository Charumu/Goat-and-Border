package com.charu.server.chat;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatReplace implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        e.setMessage(e.getMessage().replace(":skull:", "☠"));
        e.setMessage(e.getMessage().replace("<3", "❤"));
        e.setMessage(e.getMessage().replace(":heart:", "❤"));
        e.setMessage(e.getMessage().replace(":comet:", "☄"));
        e.setMessage(e.getMessage().replace(":celestia:", "☄"));
        e.setMessage(e.getMessage().replace(":star:", "⭐"));

        if (!p.isOp()) {
            if (e.getMessage().contains("&")) {
                e.setMessage(e.getMessage().replace("&", ""));
                if (e.getMessage().contains("§")) {
                    e.setMessage(e.getMessage().replace("§", ""));
                }
            }
        }
    }
}
