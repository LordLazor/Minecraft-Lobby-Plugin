package de.lordlazor.script.inventory;

import de.lordlazor.script.Script;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

public class InventoryListener implements Listener {

    @EventHandler
    public void onDrop(PlayerDropItemEvent event){
        Player player = event.getPlayer();
        event.setCancelled(true);
        player.sendMessage(Script.PREFIX + "§cDu kannst deine Items nicht fallen lassen.");
    }

    @EventHandler
    public void onIMove(InventoryClickEvent event){
        event.setCancelled(true);


    }
}
