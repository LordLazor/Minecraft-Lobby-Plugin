package de.lordlazor.script.listeners;

import de.lordlazor.script.Script;
import de.lordlazor.script.scoreboard.TestScoreboard;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){

        Player player = (Player) event.getPlayer();
        if (!player.hasPlayedBefore()) {
            player.sendMessage("§3Willkommen §2§l" + player.getDisplayName() + "§3.\n§3Schau dir doch unsere §3§n/regeln§3 an.\nViel Spaß!");
            event.setJoinMessage("§7[§2+§7] " + player.getDisplayName());
        }
        else {
            player.sendMessage("§3Willkommen zurück §2§l" + player.getDisplayName());
            event.setJoinMessage("§7[§2+§7] " + player.getDisplayName());
        }

        if(player.getDisplayName().equals("LordLazor")){
            event.setJoinMessage("§4§l" + player.getDisplayName() + " §chat den Server betreten!");
        }

        player.sendTitle("§6Willkommen", ChatColor.YELLOW + player.getDisplayName(), 20, 100, 20);

        new TestScoreboard(player);

        Script.INSTANCE.getTablistManager().setPlayerlist(player);
        Script.INSTANCE.getTablistManager().setAllPlayerTeams();

        event.getPlayer().setGameMode(GameMode.ADVENTURE);



        //Leben
        event.getPlayer().setMaxHealth(2.0d);
        event.getPlayer().setHealth(2.0d);

        event.getPlayer().setSaturation(10f);

        //Inventar
        event.getPlayer().getInventory().clear();

        ItemStack Clock = new ItemStack(Material.CLOCK);
        ItemMeta ClockMeta = Clock.getItemMeta();
        ClockMeta.setDisplayName("§6Navigator");
        Clock.setItemMeta(ClockMeta);

        ItemStack Stern = new ItemStack(Material.NETHER_STAR);
        ItemMeta SternMeta = Stern.getItemMeta();
        SternMeta.setDisplayName("§9Speed");
        Stern.setItemMeta(SternMeta);

        ItemStack Enderpearl = new ItemStack(Material.ENDER_PEARL);
        ItemMeta EnderPearlMeta = Enderpearl.getItemMeta();
        EnderPearlMeta.setDisplayName("§5Enderperle");
        Enderpearl.setItemMeta(EnderPearlMeta);

        ItemStack Blazerod = new ItemStack(Material.BLAZE_ROD);
        ItemMeta BlazeRodMeta = Blazerod.getItemMeta();
        BlazeRodMeta.setDisplayName("§bFügel");
        Blazerod.setItemMeta(BlazeRodMeta);

        ItemStack Feather = new ItemStack(Material.FEATHER);
        ItemMeta FeatherMeta = Feather.getItemMeta();
        FeatherMeta.setDisplayName("§dJetpack");
        Feather.setItemMeta(FeatherMeta);

        ItemStack Shulker = new ItemStack(Material.LIGHT_BLUE_SHULKER_BOX);
        ItemMeta ShulkerMeta = Shulker.getItemMeta();
        ShulkerMeta.setDisplayName("§aShop");
        Shulker.setItemMeta(ShulkerMeta);

        if (event.getPlayer().isOp()) {

            player.getInventory().setItem(4, Clock);
            player.getInventory().setItem(8, Stern);
            player.getInventory().setItem(0, Enderpearl);
            player.getInventory().setItem(2, Blazerod);
            //player.getInventory().setItem(6, Feather);
            player.getInventory().setItem(7, Shulker);
        }
        else {
            player.getInventory().setItem(4, Clock);
            player.getInventory().setItem(0, Enderpearl);
            player.getInventory().setItem(7, Shulker);
        }

    }
}
