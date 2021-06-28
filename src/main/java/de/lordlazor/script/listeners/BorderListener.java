package de.lordlazor.script.listeners;

import de.lordlazor.script.Script;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class BorderListener implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent event){
        Player player = event.getPlayer();

        Location playerLocation = player.getLocation();

        if (playerLocation.getX() > 100 | playerLocation.getX() < -100 | playerLocation.getZ() < -400 | playerLocation.getZ() > 0) {
        //if (player.getLocation().distance(Bukkit.getWorld("world").getSpawnLocation()) > 100 && player.getGameMode() != GameMode.CREATIVE) {
            Location location = new Location(Bukkit.getWorld("world"), -20, 64, -250);
            player.teleport(location);
            player.sendMessage(Script.PREFIX + "§cDu hast dich zu weit vom Spawn entfernt.");
            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.6f, 1.4f);
        }
    }
}
