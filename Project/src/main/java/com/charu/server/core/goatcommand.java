package com.charu.server.core;

import com.charu.server.Main;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Goat;
import org.bukkit.entity.Player;

public class goatcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.isOp()) {
                Location loc = p.getLocation();
                Goat goat = (Goat) p.getWorld().spawnEntity(loc, EntityType.GOAT);
                goat.setCustomName(ChatColor.of("#ffdcf7") + "G.O.A.T");
                goat.setCustomNameVisible(true);
                goat.setGlowing(true);
                goat.setInvulnerable(true);
                goat.setAdult();
                goat.setLeftHorn(true);
                goat.setRightHorn(true);
                goat.setBreed(false);

                p.sendMessage(org.bukkit.ChatColor.GREEN + "The" + ChatColor.of("#ffdcf7") + " G.O.A.T " + ChatColor.GREEN + "has been spawned!");
                p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0F, 1.0F);

            } else {
                p.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 1.0F, 1.0F);
            }
        }
        return true;
    }
}