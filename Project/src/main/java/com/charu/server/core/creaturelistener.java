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
            zombie.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(40);
            zombie.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(8);
            zombie.setHealth(35);
            zombie.damage(8);
            zombie.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
        }

        if (e.getEntityType() == EntityType.HUSK) {

            Husk husk = (Husk) e.getEntity();
            husk.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(40);
            husk.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(8);
            husk.setHealth(35);
            husk.damage(8);
            husk.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
        }

        if (e.getEntityType() == EntityType.DROWNED) {

            Drowned drowned = (Drowned) e.getEntity();
            drowned.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(40);
            drowned.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(8);
            drowned.setHealth(35);
            drowned.damage(8);
            drowned.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
        }

        if (e.getEntityType() == EntityType.STRAY) {

            Stray stray = (Stray) e.getEntity();
            stray.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(40);
            stray.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(9);
            stray.setHealth(35);
            stray.damage(9);
            stray.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
        }

        if (e.getEntityType() == EntityType.SKELETON) {

            Skeleton skeleton = (Skeleton) e.getEntity();
            skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(30);
            skeleton.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(9);
            skeleton.damage(9);
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

        if (e.getEntityType() == EntityType.ENDERMAN) {
            Enderman enderman = (Enderman) e.getEntity();
            enderman.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(55);
            enderman.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(11);
            enderman.damage(11);
            enderman.setHealth(55);
        }
    }

    @EventHandler
    public void onDeath(EntityDeathEvent e) {
        Random random = new Random();
        double chance = random.nextDouble();

        ItemStack wheat = new ItemStack(Material.WHEAT);
        ItemStack iron = new ItemStack(Material.RAW_IRON);
        ItemStack lead = new ItemStack(Material.LEAD);

        if (e.getEntityType() == EntityType.ZOMBIE) {
            if (chance <= 0.50F) {
                e.getDrops().add(wheat);
            } else {
                e.getDrops().add(iron);
            }
        }

        if (e.getEntityType() == EntityType.HUSK) {
            if (chance <= 0.50F) {
                e.getDrops().add(wheat);
            } else {
                e.getDrops().add(iron);
            }
        }

        if (e.getEntityType() == EntityType.DROWNED) {
            if (chance <= 0.50F) {
                e.getDrops().add(wheat);
            } else {
                e.getDrops().add(iron);
            }
        }

        if (e.getEntityType() == EntityType.STRAY) {
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
        }

        if (e.getEntityType() == EntityType.ENDERMAN) {
            if (chance <= 0.10F) {
                e.getDrops().add(lead);
            }
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