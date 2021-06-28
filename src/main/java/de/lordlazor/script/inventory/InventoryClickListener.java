package de.lordlazor.script.inventory;

import de.lordlazor.script.Script;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import javax.print.attribute.IntegerSyntax;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onCompass(PlayerInteractEvent event){

        if (event.getPlayer() instanceof Player){

            Player player = event.getPlayer();

            if (player.getItemInHand().getType() == Material.NETHER_STAR) {
                if (event.getItem().getItemMeta().getDisplayName().equals("§9Speed")) {

                    if (player.hasPotionEffect(PotionEffectType.SPEED)) {
                        player.removePotionEffect(PotionEffectType.SPEED);
                        player.sendMessage(Script.PREFIX + "§cDer Speed-Effekt wurde deaktiviert.");
                        player.playSound(player.getLocation(), Sound.ENTITY_WANDERING_TRADER_DRINK_POTION, 0.6f, 1.4f);
                    } else {
                        player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));
                        player.sendMessage(Script.PREFIX + "§2Der Speed-Effekt wurde aktiviert.");
                        player.playSound(player.getLocation(), Sound.ENTITY_WANDERING_TRADER_DRINK_POTION, 0.6f, 1.4f);
                    }
                }
            }
            if (player.getItemInHand().getType() == Material.BLAZE_ROD) {
                if (event.getItem().getItemMeta().getDisplayName().equals("§bFügel")) {

                    ItemStack Elytra = new ItemStack(Material.ELYTRA);
                    ItemMeta ElytraMeta = Elytra.getItemMeta();
                    ElytraMeta.setDisplayName("§bFlüüügel");
                    Elytra.setItemMeta(ElytraMeta);

                    if (player.getAllowFlight() == false) {
                        player.setAllowFlight(true);
                        player.sendMessage(Script.PREFIX + "§2Du hast Flüüügel an.");
                        player.getInventory().setChestplate(Elytra);
                        player.playSound(player.getLocation(), Sound.ITEM_ARMOR_EQUIP_ELYTRA, 0.6f, 1.4f);
                    } else {
                        player.setAllowFlight(false);
                        player.getInventory().setChestplate(null);
                        player.sendMessage(Script.PREFIX + "§cRed Bull verloren?");
                        player.playSound(player.getLocation(), Sound.ITEM_ARMOR_EQUIP_ELYTRA, 0.6f, 1.4f);
                    }


                }

            }
            if (player.getItemInHand().getType() == Material.FEATHER) {
                if (event.getItem().getItemMeta().getDisplayName().equals("§dJetpack")) {
                        player.playSound(player.getLocation(), Sound.ENTITY_BLAZE_SHOOT, 0.6f, 1.4f);
                        Vector vector = player.getLocation().getDirection().multiply(40).setY(60).normalize();
                        player.setVelocity(vector);
                        player.playEffect(player.getLocation(), Effect.MOBSPAWNER_FLAMES, 0);
                }

            }
        }
    }

    @EventHandler
    public void onClick(InventoryClickEvent event){
        if (event.getWhoClicked() instanceof Player){
            Player player = (Player) event.getWhoClicked();

            if (event.getWhoClicked().getWorld().getName().equals("world")){
                if (event.getCurrentItem() != null){
                    if (event.getCurrentItem().hasItemMeta()){

                        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§6Navigator")){
                            player.openInventory(Script.ClockInventory);
                            event.setCancelled(true);
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§cBedwars")){
                            player.sendMessage(Script.PREFIX + "Demnächst verfügbar.");
                            player.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 0.6f, 1.4f);
                            player.closeInventory();
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§eSpawn")){
                            Location location = new Location(Bukkit.getWorld("world"), -20, 64, -250);
                            player.teleport(location);
                            player.sendMessage(Script.PREFIX + "Du wurdest zum Spawn teleportiert.");
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.6f, 1.4f);
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§9SkyPvP")){
                            player.sendMessage(Script.PREFIX + "Demnächst verfügbar.");
                            player.playSound(player.getLocation(), Sound.ENTITY_LIGHTNING_BOLT_THUNDER, 0.6f, 1.4f);
                            player.closeInventory();
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§8---")){
                            player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 0.6f, 1.4f);
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§aShop")){
                            player.openInventory(Script.ShulkerInventory);
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.6f, 1.4f);
                            event.setCancelled(true);
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§6Boots")){
                            player.closeInventory();
                            player.openInventory(Script.BootsInventory);
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.6f, 1.4f);
                            event.setCancelled(true);

                        }

                        if(event.getCurrentItem().getItemMeta().getDisplayName().equals("§4Herz Schuhe")){
                            ItemStack LeatherJetpack = new ItemStack(Material.LEATHER_BOOTS);
                            ItemMeta LeatherJetpackMeta = LeatherJetpack.getItemMeta();
                            LeatherJetpackMeta.setDisplayName("§4Herz Schuhe");
                            LeatherJetpack.setItemMeta(LeatherJetpackMeta);

                            player.getInventory().setBoots(LeatherJetpack);
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§dJetpack")){

                            ItemStack Feather = new ItemStack(Material.FEATHER);
                            ItemMeta FeatherMeta = Feather.getItemMeta();
                            FeatherMeta.setDisplayName("§dJetpack");
                            Feather.setItemMeta(FeatherMeta);
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.6f, 1.4f);


                            if (player.getInventory().contains(Feather)){
                                player.closeInventory();
                                player.getInventory().removeItem(Feather);
                                player.sendMessage(Script.PREFIX + "Du hast das §dJetpack §bnun nicht mehr ausgerüstet.");
                                event.setCancelled(true);
                            }
                            else {
                                player.closeInventory();
                                player.getInventory().setItem(6, Feather);
                                player.sendMessage(Script.PREFIX + "Du hast das §dJetpack §bausgerüstet.");
                                event.setCancelled(true);
                            }
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§dKöpfe")){
                            player.closeInventory();
                            player.openInventory(Script.HeadsInventory);
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.6f, 1.4f);
                            event.setCancelled(true);
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§bAnzüge")){
                            player.closeInventory();
                            player.openInventory(Script.AnzugInventory);
                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.6f, 1.4f);
                            event.setCancelled(true);
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§bDiamant Rüstung")){
                            player.closeInventory();

                            ItemStack Diamond = new ItemStack(Material.DIAMOND_CHESTPLATE);
                            ItemMeta DiamondMeta = Diamond.getItemMeta();
                            DiamondMeta.setDisplayName("§bDiamant Rüstung");
                            Diamond.setItemMeta(DiamondMeta);

                            player.getInventory().setChestplate(Diamond);

                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.6f, 1.4f);

                            player.sendMessage(Script.PREFIX + "Du hast die §b§lDiamant Rüstung §bangezogen.");

                            event.setCancelled(true);
                        }

                        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("§aCreeper Kopf")){
                            player.closeInventory();

                            ItemStack CreeperHead = new ItemStack(Material.CREEPER_HEAD);
                            ItemMeta CreeperHeadMeta = CreeperHead.getItemMeta();
                            CreeperHeadMeta.setDisplayName("§aCreeper Kopf");
                            CreeperHead.setItemMeta(CreeperHeadMeta);

                            player.getInventory().setHelmet(CreeperHead);

                            player.playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 0.6f, 1.4f);

                            player.sendMessage(Script.PREFIX + "Du hast den §aCreeper Kopf §bangezogen.");

                            event.setCancelled(true);

                        }

                    }
                }
            }
        }
    }

}
