package com.charu.server.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class tutorialcommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Inventory tutorial = Bukkit.createInventory(p, 27, ChatColor.of("#ffdcf7") + "" + ChatColor.BOLD + "Tutorial");

            ItemStack book = new ItemStack(Material.KNOWLEDGE_BOOK);
            ItemMeta meta = book.getItemMeta();
            meta.setDisplayName(ChatColor.of("#ffdcf7") + "World Border");
            meta.setLore(Arrays.asList(
                    "\n",
                    ChatColor.GRAY + "The world is always set in a 50x50",
                    ChatColor.GRAY + "world border, in which you have to",
                    ChatColor.GRAY + "survive in."
            ));
            book.setItemMeta(meta);

            ItemStack book2 = new ItemStack(Material.KNOWLEDGE_BOOK);
            ItemMeta meta2 = book2.getItemMeta();
            meta2.setDisplayName(ChatColor.of("#ffdcf7") + "G.O.A.T");
            meta2.setLore(Arrays.asList(
                    "\n",
                    ChatColor.GRAY + "The only way to move the border",
                    ChatColor.GRAY + "is to move the glowing goat.",
                    ChatColor.GRAY + "Use wheat dropped from mobs",
                    ChatColor.GRAY + "to move the goat. Or get a lead, good luck."
            ));
            book2.setItemMeta(meta2);

            ItemStack book3 = new ItemStack(Material.KNOWLEDGE_BOOK);
            ItemMeta meta3 = book3.getItemMeta();
            meta3.setDisplayName(ChatColor.of("#ffdcf7") + "Harsh Environment");
            meta3.setLore(Arrays.asList(
                    "\n",
                    ChatColor.GRAY + "All the monsters have been buffed,",
                    ChatColor.GRAY + "especially creepers, who spawn",
                    ChatColor.GRAY + "charged.",
                    ChatColor.GRAY + "Zombies and skeletons don't burn in the sun.",
                    "\n",
                    ChatColor.GRAY + "Not all hope is lost, because",
                    ChatColor.GRAY + "When you kill a monster,.",
                    ChatColor.GRAY + "you have a chance of obtaining raw iron."
            ));
            book3.setItemMeta(meta3);

            ItemStack frame = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
            ItemMeta meta4 = frame.getItemMeta();
            meta4.setDisplayName(" ");
            frame.setItemMeta(meta4);
            for (int i : new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 17, 18, 19, 20, 21, 22, 23 ,24, 25, 26})
                tutorial.setItem(i, frame);

            tutorial.setItem(11, book);
            tutorial.setItem(13, book2);
            tutorial.setItem(15, book3);

            p.openInventory(tutorial);
        }
        return false;
    }
}