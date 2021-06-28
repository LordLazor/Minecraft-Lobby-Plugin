package de.lordlazor.script.commands;

import de.lordlazor.script.Script;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ClearCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        Player player = (Player) sender;
        if(player.hasPermission("de.lordlazor.testplugin.clear")){
            player.getInventory().clear();
            player.sendMessage(Script.PREFIX + "Dein Inventar wurde geleert.");
        }
        else{
            player.sendMessage(Script.PREFIX + "§cDu hast keine Berechtigung dafür");
        }


        return false;
    }
}
