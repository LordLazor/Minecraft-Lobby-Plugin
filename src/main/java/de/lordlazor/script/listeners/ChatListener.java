package de.lordlazor.script.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event){

        Player player = event.getPlayer();

        if(player.getDisplayName().equals("LordLazor")){
            event.setFormat("§4Team §7| " + ChatColor.RED + "%1$s" + " §7→ " + ChatColor.RED + "%2$s");
        }
        else if (player.getDisplayName().equals("Administrator")){
            event.setFormat("§4§lDuty §7| " + ChatColor.RED + ChatColor.BOLD + "%1$s" + " §7→ " + ChatColor.RED + ChatColor.BOLD + "%2$s");
        }
        else if (player.isOp()) {
            event.setFormat("§cTeam §7| " + ChatColor.DARK_RED + "%1$s" + " §7→ " + ChatColor.RED + "%2$s");
        }
        else {
            event.setFormat(ChatColor.DARK_GREEN + "%1$s" + " §7→ " + ChatColor.WHITE + "%2$s");
        }



    }
}
