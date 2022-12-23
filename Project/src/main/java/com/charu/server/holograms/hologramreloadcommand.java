package com.charu.server.holograms;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class hologramreloadcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        String[] lines = new String[]{
                ChatColor.GRAY + "Line 1",
                "Line 2",
                ChatColor.of("#73dfff") + "Test"
        };

        for (String line : lines) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                Location location = p.getLocation();
                Location loc = new Location(p.getPlayer().getWorld(), 507.5, 63, 586.5);
                if (p.isOp()) {
                    ArmorStand test = (ArmorStand) p.getWorld().spawnEntity(location.subtract(0, 2, 0), EntityType.ARMOR_STAND);
                    test.setInvisible(true);
                    test.setInvulnerable(true);
                    test.setGravity(false);
                    test.setCustomNameVisible(true);

                    test.setCustomName(line);

                } else {
                    p.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
                }
            }
        }
        return false;
    }
}