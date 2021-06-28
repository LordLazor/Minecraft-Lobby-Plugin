package de.lordlazor.script.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class TestScoreboard extends ScoreboardBuilder{
    public TestScoreboard(Player player) {
        super(player, " §c§lLazar's Dev Server ");
    }

    @Override
    public void createScoreboard(){
        setScore(ChatColor.DARK_GRAY.toString(), 14);
        setScore("§7Dein Rang:", 13);

        if(player.isOp()){
            setScore("§4Operator", 12);
        }
        else {
            setScore("§2Spieler", 12);
        }

        setScore(ChatColor.GRAY.toString(), 11);
        setScore(ChatColor.GRAY + "Aktueller Server:", 10);
        setScore(ChatColor.RED + "Lobby", 9);
        setScore(ChatColor.DARK_PURPLE.toString(), 8);
        setScore(ChatColor.WHITE + "github.com/LordLazor", 7);
        setScore(ChatColor.WHITE.toString(), 6);
        setScore(ChatColor.DARK_PURPLE + "Deine IP:", 5);
        setScore(ChatColor.LIGHT_PURPLE + player.getAddress().getHostName(), 4);
        setScore(ChatColor.AQUA.toString(), 3);
        setScore(ChatColor.GOLD + "Server-IP:", 2);
        setScore(ChatColor.YELLOW + "Lazar.dev", 1);
        setScore(ChatColor.DARK_AQUA.toString(), 0);
    }

    @Override
    public void update(){

    }
}
