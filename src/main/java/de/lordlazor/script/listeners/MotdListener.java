package de.lordlazor.script.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class MotdListener implements Listener {

    @EventHandler
    public void serverMotd(ServerListPingEvent event){
        event.setMotd("§3Lazar's §bDev-Server\n§eViel Spaß beim erkunden :)");
        event.setMaxPlayers(10);
    }
}
