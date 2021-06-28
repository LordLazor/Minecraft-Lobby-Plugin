package de.lordlazor.script.commands;

import de.lordlazor.script.Script;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BroadcastCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player)){
            Script.INSTANCE.log(Script.PREFIX + "Du bist kein Spieler");
            return true;
        }

        Player player = (Player) sender;

        if (sender.hasPermission("de.lordlazor.testplugin.broadcast")) {
            if (args.length == 0){
                player.sendMessage(Script.PREFIX + "Benutze: /bc [Nachricht]");
            }
            else if(args.length >= 1) {
                String message = "";
                for (String part : args) {
                    if (message != "") message += " ";
                    message += part;
                }
                Bukkit.getServer().broadcastMessage("§4Server §7→ §c" + message);
            }
        }
        else {
            player.sendMessage(Script.PREFIX + "§cDu hast keine Berechtigung dafür.");
        }
        return false;
    }
}
