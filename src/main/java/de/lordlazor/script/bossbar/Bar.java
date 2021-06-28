package de.lordlazor.script.bossbar;

import de.lordlazor.script.Script;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class Bar {

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    private int taskID = -1;
    private Script plugin;
    private BossBar bar;

    public Bar(Script plugin) {
        this.plugin = plugin;
    }

    public void addPlayer(Player player){
        bar.addPlayer(player);
    }

    public BossBar getBar(){
        return bar;
    }

    public void createBar(){
        bar = Bukkit.createBossBar("§cLazar's Dev Server", BarColor.RED, BarStyle.SOLID);
        bar.setVisible(true);
        cast();
    }

    public void cast(){
        taskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {

            int count = -1;
            double progress = 1.0;
            double time = 1.0 / (10 * 20);

            @Override
            public void run() {
                bar.setProgress(progress);

                switch (count){
                    case -1:
                        break;
                    case 0:
                        bar.setColor(BarColor.RED);
                        bar.setTitle("§7Du befindest dich in der §cLobby");
                        break;
                    case 1:
                        bar.setColor(BarColor.YELLOW);
                        bar.setTitle("§eHole §6Premium §efür coole Gadgets!");
                        break;
                    case 2:
                        bar.setColor(BarColor.BLUE);
                        bar.setTitle("§bBesuch' doch unsere Website: §7Lazar.dev");
                        break;
                    case 3:
                    default:
                        bar.setColor(BarColor.RED);
                        bar.setTitle("§cLazar's Dev Server");
                        count = -1;
                        break;
                }

                progress = progress - time;
                if(progress <= 0){
                    count++;
                    progress = 1.0;
                }

            }
        }, 0, 0);
    }

}
