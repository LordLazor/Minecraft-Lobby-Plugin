package de.lordlazor.script.commands;

import de.lordlazor.script.Script;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GamemodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {

        if (!(sender instanceof Player)) {
            Script.INSTANCE.log("Du bist kein Spieler!");
            return true;
        }

        Player player = (Player) sender;

        if (sender.hasPermission("de.lordlazor.testplugin.gm")) {
            if (args.length < 1 || !args[0].matches("[0-3]")) {
                player.sendMessage(Script.PREFIX + "Bitte benutze: /gm [0-3]");
                return true;
            } else if (args[0].equals("1")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(Script.PREFIX + "Du bist nun im §cKreativ-Modus§b.");
            } else if (args[0].equals("0")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(Script.PREFIX + "Du bist nun im §fSurvival-Modus§b.");
            } else if (args[0].equals("2")) {
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage(Script.PREFIX + "Du bist nun im §6Adventure-Modus§b.");
            } else if (args[0].equals("3")) {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage(Script.PREFIX + "Du bist nun im §8Zuschauer-Modus§b.");
            }
        }
        else {
            player.sendMessage(Script.PREFIX + "§cDu hast keine Berechtigung dafür.");
        }

        return false;
    }
}
