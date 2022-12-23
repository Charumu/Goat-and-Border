package com.charu.server;

import com.charu.server.chat.ChatReplace;
import com.charu.server.commands.*;
import com.charu.server.core.creaturelistener;
import com.charu.server.core.goatcommand;
import com.charu.server.holograms.hologramreloadcommand;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.WorldBorder;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new ChatReplace(), this);
        Bukkit.getPluginManager().registerEvents(new tutoriallistener(), this);
        Bukkit.getPluginManager().registerEvents(new creaturelistener(), this);

        getCommand("rules").setExecutor(new rulescommand());
        getCommand("vanish").setExecutor(new vanishcommand());
        getCommand("discord").setExecutor(new discordcommand());
        getCommand("heal").setExecutor(new healcommand());
        getCommand("clearchat").setExecutor(new clearchatcommand());
        getCommand("tutorial").setExecutor(new tutorialcommand());
        getCommand("hologramreload").setExecutor(new hologramreloadcommand());
        getCommand("spawngoat").setExecutor(new goatcommand());

        Bukkit.getScheduler().runTaskTimer(this, () -> {
            for (World world : Bukkit.getWorlds()) {
                for (Entity entity : world.getEntities()) {
                    if (entity.isInvulnerable()) {
                        Location loc2 = entity.getLocation();
                        WorldBorder border = (WorldBorder) entity.getWorld().getWorldBorder();
                        border.setCenter(loc2);
                    }
                }
            }
        }, 1, 1);

    }
    @Override
    public void onDisable() {
    }
}