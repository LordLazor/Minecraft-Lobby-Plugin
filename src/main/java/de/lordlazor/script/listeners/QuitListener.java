package de.lordlazor.script.listeners;

import de.lordlazor.script.Script;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {

    @EventHandler
    public void onQuit(PlayerQuitEvent event){
        Player player = (Player) event.getPlayer();
        event.setQuitMessage(Script.PREFIX + "§7[§c-§7] " + player.getDisplayName());

        if(player.getDisplayName().equals("LordLazor")){
            event.setQuitMessage("§4§l" + player.getDisplayName() + " §chat den Server verlassen!");
        }

    }
}
