package de.lordlazor.script.commands;

import de.lordlazor.script.Script;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            Script.INSTANCE.log("Du bist kein Spieler!");
            return true;
        }

        Player player = (Player) sender;

        if (player.hasPermission("de.lordlazor.testplugin.heal")) {
            player.setHealth(20d);
            player.setFoodLevel(20);
            player.sendMessage(Script.PREFIX + "Du wurdest geheilt!");
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.2f, 1.2f);
        }
        else {
            player.sendMessage(Script.PREFIX + "§cDu hast keine Berechtigung dafür.");
        }

        return true;
    }
}
