package de.lordlazor.script.commands;

import de.lordlazor.script.Script;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;
import org.jetbrains.annotations.NotNull;

public class AdminCommand implements CommandExecutor {

    private Script plugin;

    public AdminCommand(Script plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            Script.INSTANCE.log("Du bist kein Spieler!");
            return true;
        }

        Player player = (Player) sender;

        PermissionAttachment attachment = player.addAttachment(plugin);

        if (sender.hasPermission("de.lordlazor.testplugin.admin")) {
            if (!player.getDisplayName().equals("Administrator")) {
                player.setDisplayName("Administrator");
                player.sendMessage(Script.PREFIX + "Du bist nun im Admin-Modus.");
                attachment.setPermission("de.lordlazor.testplugin.gm", true);
                attachment.setPermission("de.lordlazor.testplugin.clear", true);
                attachment.setPermission("de.lordlazor.testplugin.fly", true);
                attachment.setPermission("de.lordlazor.testplugin.broadcast", true);
                attachment.setPermission("de.lordlazor.testplugin.heal", true);
            }
            else {
                player.setDisplayName(null);
                player.sendMessage(Script.PREFIX + "Du bist nun nicht mehr im Admin-Modus.");
                attachment.unsetPermission("de.lordlazor.testplugin.gm");
                attachment.unsetPermission("de.lordlazor.testplugin.clear");
                attachment.unsetPermission("de.lordlazor.testplugin.fly");
                attachment.unsetPermission("de.lordlazor.testplugin.broadcast");
                attachment.unsetPermission("de.lordlazor.testplugin.heal");
            }
        }
        else {
            player.sendMessage(Script.PREFIX + "§cDu hast keine Berechtigung dafür.");
        }





        return false;
    }

}
