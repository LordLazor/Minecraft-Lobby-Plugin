package de.lordlazor.script.listeners;

import de.lordlazor.script.Script;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EnderpearlListener implements Listener {

    @EventHandler
    public void onPearlHit(final ProjectileHitEvent event){
        final ItemStack Enderpearl = new ItemStack(Material.ENDER_PEARL);
        ItemMeta EnderPearlMeta = Enderpearl.getItemMeta();
        EnderPearlMeta.setDisplayName("§5Enderperle");
        Enderpearl.setItemMeta(EnderPearlMeta);

        if(event.getEntity() instanceof EnderPearl){
            Bukkit.getScheduler().runTaskLater(Script.plugin, new Runnable() {
                @Override
                public void run() {
                    if (event.getEntity().getShooter() instanceof Player){
                        Player shooter = (Player) event.getEntity().getShooter();
                        shooter.getInventory().setItem(0, Enderpearl);
                    }
                }
            }, 20*5);
        }
    }

}
