package com.charu.server.core;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class creaturelistener implements Listener {

    @EventHandler
    public void onSpawn(CreatureSpawnEvent e) {
        if (e.getEntityType() == EntityType.ZOMBIE) {

            Zombie zombie = (Zombie) e.getEntity();
            zombie.damage(5);
            zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(40);
            zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(6);
            zombie.setHealth(35);
            zombie.damage(6);
            zombie.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
        }
        if (e.getEntityType() == EntityType.SKELETON) {

            Skeleton skeleton = (Skeleton) e.getEntity();
            skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(30);
            skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(7);
            skeleton.damage(7);
            skeleton.setHealth(30);
            skeleton.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
        }
        if (e.getEntityType() == EntityType.SPIDER) {
            Spider spider = (Spider) e.getEntity();
            spider.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(25);
            spider.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(8);
            spider.damage(8);
            spider.setHealth(25);
        }
        if (e.getEntityType() == EntityType.CREEPER) {
            Creeper creeper = (Creeper) e.getEntity();
            creeper.setPowered(true);
            creeper.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(25);
            creeper.setHealth(25);
        }
    }

    @EventHandler
    public void onDeath(EntityDeathEvent e) {
        Random random = new Random();
        double chance = random.nextDouble();

        ItemStack wheat = new ItemStack(Material.WHEAT);
        ItemStack iron = new ItemStack(Material.RAW_IRON);

        if (e.getEntityType() == EntityType.ZOMBIE) {
            if (chance <= 0.50F) {
                e.getDrops().add(wheat);
            } else {
                e.getDrops().add(iron);
            }
        }

        if (e.getEntityType() == EntityType.SKELETON) {
            if (chance <= 0.50F) {
                e.getDrops().add(wheat);
            } else {
                e.getDrops().add(iron);
            }
        }

        if (e.getEntityType() == EntityType.SPIDER) {
            if (chance <= 0.50F) {
                e.getDrops().add(wheat);
            } else {
                e.getDrops().add(iron);
            }

            if (e.getEntityType() == EntityType.CREEPER) {
                if (chance <= 0.50F) {
                    e.getDrops().add(wheat);
                } else {
                    e.getDrops().add(iron);
                }
            }
        }
    }
}