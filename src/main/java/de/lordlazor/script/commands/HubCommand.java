package de.lordlazor.script.commands;

import de.lordlazor.script.Script;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HubCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player)){
            Script.INSTANCE.log(Script.PREFIX + "Du bist kein Spieler");
            return true;
        }

        Player player = (Player) sender;

        Location location = new Location(Bukkit.getWorld("world"), -20, 64, -250);
        player.teleport(location);
        player.sendMessage(Script.PREFIX + "Du wurdest zum Spawn teleportiert.");
        player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.6f, 1.4f);

        return false;
    }
}
