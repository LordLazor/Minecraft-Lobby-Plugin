package de.lordlazor.script.inventory;

import de.lordlazor.script.Script;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class InteractListener implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        if (event.hasItem()) {
            if (event.getItem().hasItemMeta()) {
                if (event.getItem().getItemMeta().getDisplayName().equals("§6Navigator")) {
                    player.openInventory(Script.ClockInventory);
                    player.sendMessage(Script.PREFIX + "§cNavigator wird geöffnet...");
                    player.playSound(player.getLocation(), Sound.BLOCK_CHEST_OPEN, 0.6f, 1.4f);
                    event.setCancelled(true);
                }

                else if (event.getItem().getItemMeta().getDisplayName().equals("§aShop")) {
                    player.openInventory(Script.ShulkerInventory);
                    player.sendMessage(Script.PREFIX + "§cShop wird geöffnet...");
                    player.playSound(player.getLocation(), Sound.BLOCK_CHEST_OPEN, 0.6f, 1.4f);
                    event.setCancelled(true);
                }

            }
        }
    }

}
