package de.lordlazor.script;

import de.lordlazor.script.bossbar.Bar;
import de.lordlazor.script.commands.*;
import de.lordlazor.script.inventory.*;
import de.lordlazor.script.listeners.*;
import de.lordlazor.script.tablist.TablistManager;
import de.lordlazor.script.tasks.KeepDayTask;
import de.lordlazor.script.utils.Config;
import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class Script extends JavaPlugin implements Listener {

    public static String PREFIX = "§3Lobby §8- §b";
    public static Script INSTANCE;

    public static Inventory ClockInventory = Bukkit.createInventory(null, InventoryType.CHEST, "§6Navigator");
    public static Inventory ShulkerInventory = Bukkit.createInventory(null, InventoryType.CHEST, "§aShop");
    public static Inventory AnzugInventory = Bukkit.createInventory(null, InventoryType.CHEST, "§bAnzüge");
    public static Inventory HeadsInventory = Bukkit.createInventory(null, InventoryType.CHEST, "§dKöpfe");
    public static Inventory BootsInventory = Bukkit.createInventory(null, InventoryType.CHEST, "§6Jetpacks");

    public Bar bar;

    public static Plugin plugin;

    private TablistManager tablistManager;


    public Script(){
        INSTANCE = this;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.plugin = this;

        new Config();

        log("Plugin läd");
        listenerRegistration();
        log("Listener wurden gestartet!");
        commandRegistration();
        log("Commands wurden aktiviert!");
        taskRegistration();
        log("Tasks wurden aktiviert!");
        log("Plugin wurde aktiviert");
        tablistManager = new TablistManager();

        Functions.befuellen();

        Bukkit.getWorld("world").setDifficulty(Difficulty.PEACEFUL);

        //Bar
        this.getServer().getPluginManager().registerEvents(this, this);
        bar = new Bar(this);
        bar.createBar();

        if(Bukkit.getOnlinePlayers().size() > 0)
            for (Player on : Bukkit.getOnlinePlayers())
                bar.addPlayer(on);

    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        if(!bar.getBar().getPlayers().contains(event.getPlayer())){
            bar.addPlayer(event.getPlayer());
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        log("Plugin wurde deaktiviert");

        bar.getBar().removeAll();
    }

    public void log(String text){
        Bukkit.getConsoleSender().sendMessage(PREFIX + text);
    }

    private void listenerRegistration(){
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(), this);
        pluginManager.registerEvents(new QuitListener(), this);
        pluginManager.registerEvents(new ChatListener(), this);
        pluginManager.registerEvents(new InventoryListener(), this);
        pluginManager.registerEvents(new DamageListener(), this);
        pluginManager.registerEvents(new MotdListener(), this);
        pluginManager.registerEvents(new GoodWeatherListener(), this);
        pluginManager.registerEvents(new InventoryClickListener(), this);
        pluginManager.registerEvents(new InteractListener(), this);
        pluginManager.registerEvents(new EnderpearlListener(), this);
        pluginManager.registerEvents(new BorderListener(), this);
    }

    private void commandRegistration(){
        Bukkit.getPluginCommand("heal").setExecutor(new HealCommand());
        Bukkit.getPluginCommand("broadcast").setExecutor(new BroadcastCommand());
        Bukkit.getPluginCommand("backpack").setExecutor(new BackpackCommand());
        Bukkit.getPluginCommand("regeln").setExecutor(new RegelnCommand());
        Bukkit.getPluginCommand("fly").setExecutor(new FlyCommand());
        Bukkit.getPluginCommand("gm").setExecutor(new GamemodeCommand());
        Bukkit.getPluginCommand("admin").setExecutor(new AdminCommand(this));
        Bukkit.getPluginCommand("clear").setExecutor(new ClearCommand());
        Bukkit.getPluginCommand("hub").setExecutor(new HubCommand());
        Bukkit.getPluginCommand("shop").setExecutor(new ShopCommand());
    }

    private void taskRegistration(){
        BukkitTask keepDayTask = new KeepDayTask(this).runTaskTimer(this, 0L, 100L);
    }

    public TablistManager getTablistManager() {
        return tablistManager;
    }
}
