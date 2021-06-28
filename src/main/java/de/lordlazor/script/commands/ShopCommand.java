package de.lordlazor.script.commands;

import de.lordlazor.script.Script;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ShopCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.getPlayer().getWorld().getName().equals("world")) {
                player.openInventory(Script.ShulkerInventory);
                player.sendMessage(Script.PREFIX + "§cShop wird geöffnet...");
                player.playSound(player.getLocation(), Sound.BLOCK_CHEST_OPEN, 0.6f, 1.4f);
            }
        }

        return false;
    }
}
