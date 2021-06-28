package de.lordlazor.script.commands;

import de.lordlazor.script.Script;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            Script.INSTANCE.log("Du bist kein Spieler!");
            return true;
        }
        Player player = (Player) sender;

        if (sender.hasPermission("de.lordlazor.testplugin.fly")) {
            if (player.getAllowFlight() == false) {
                player.setAllowFlight(true);
                player.sendMessage(Script.PREFIX + "Du kannst nun fliegen bre.");
            } else {
                player.setAllowFlight(false);
                player.sendMessage(Script.PREFIX + "Du kannst nicht mehr fliegen bre.");
            }
        }
        else {
            player.sendMessage(Script.PREFIX + "§cDu hast keine Berechtigung dafür.");
        }


        return false;
    }
}
