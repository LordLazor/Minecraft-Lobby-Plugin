package de.lordlazor.script.commands;

import de.lordlazor.script.Script;
import de.lordlazor.script.utils.Config;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class BackpackCommand implements CommandExecutor {

    private Inventory inventory;

    public BackpackCommand() {

        int slots = 27;

        if(Config.contains("command.backpack.slots")){
            slots = (int) Config.get("command.backpack.slots");
        } else {
            try {
                Config.set("command.backpack.slots", 27);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        this.inventory = Bukkit.createInventory(null, slots, "§6Rucksack");
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            player.openInventory(inventory);
        }
        else {
            sender.sendMessage(Script.PREFIX + "§cDu bist kein Spieler.");
        }
        return false;
    }
}
