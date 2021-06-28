package de.lordlazor.script.commands;

import de.lordlazor.script.Script;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class RegelnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)){
            Script.INSTANCE.log("Du bist kein Spieler!");
            return true;
        }

        Player player = (Player) sender;
        player.sendMessage("§6§lRegeln:\n");
        player.sendMessage("§7§lRegel Nummero 1");
        player.sendMessage("§7§lRegel Nummero 2");
        player.sendMessage("§7§lRegel Nummero 3");
        player.sendMessage("§7§lRegel Nummero 4");
        player.sendMessage("§7§lRegel Nummero 5");

        return false;
    }
}
