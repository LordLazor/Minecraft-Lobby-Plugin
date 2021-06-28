package de.lordlazor.script.tablist;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class TablistManager {

    public void setPlayerlist(Player player){
        player.setPlayerListHeaderFooter(ChatColor.DARK_GRAY.toString() + ChatColor.STRIKETHROUGH + "                " +
                ChatColor.DARK_GRAY + "[ " + ChatColor.BLUE + ChatColor.BOLD + "Lazar's Dev Server " + ChatColor.DARK_GRAY + "]" +
                ChatColor.DARK_GRAY.toString() + ChatColor.STRIKETHROUGH + "                " + ChatColor.RESET +
                "\n" + ChatColor.GRAY + "\nWillkommen auf dem Dev Server " + ChatColor.AQUA + ChatColor.UNDERLINE + player.getDisplayName() + ChatColor.GRAY + ".\n", ChatColor.BLUE + "\nViel Spaß beim umschauen (^.^)");
    }

    public void setAllPlayerTeams(){
        Bukkit.getOnlinePlayers().forEach(this::setPlayerTeams);
    }

    public void setPlayerTeams(Player player){
        Scoreboard scoreboard = player.getScoreboard();

        Team players = scoreboard.getTeam("010players");

        if(players == null){
            players = scoreboard.registerNewTeam("010players");
        }

        Team operators = scoreboard.getTeam("001operators");

        if (operators == null) {
            operators = scoreboard.registerNewTeam("001operators");
        }

        players.setPrefix(ChatColor.GREEN + "Spieler " + ChatColor.GRAY + "| ");
        players.setColor(ChatColor.GRAY);

        operators.setPrefix(ChatColor.DARK_RED + "Team " + ChatColor.GRAY + "| ");
        operators.setColor(ChatColor.GRAY);

        for (Player target : Bukkit.getOnlinePlayers()){
            if(target.isOp()){
                operators.addEntry(target.getName());
                continue;
            }

            players.addEntry(target.getName());
        }
    }

}
