package de.lordlazor.script.tasks;

import de.lordlazor.script.Script;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class KeepDayTask extends BukkitRunnable {

    Script plugin;

    public KeepDayTask(Script plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run(){
        Bukkit.getServer().getWorld("world").setTime(6500L);
    }
}
