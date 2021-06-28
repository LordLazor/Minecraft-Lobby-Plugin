# Minecraft Lobby Plugin

**Hier findet ihr ein simples Lobby Plugin für einen Minecraft Server.
*Jeder hat vollste Erlaubnis den Quelltext zu verwenden und zu modifizieren!

**Features:

*Befehle
/admin - Rechte für /gm, /clear, /fly, broadcast und /heal [OP]
/backpack - Ein Rucksack -> Kann verändert werden zu einem weiteren Inventar (In config.yml veränderbar)
/clear - Leert dein Inventar
/fly - Lässt dich fliegen
/hub - Du wirst zum Spawn teleportiert
/gm (0-3) - Ändert deinen Gamemode
/regeln - Zeigt Regeln an, die individuell einstellbar sind
/shop - Öffnet den Cosmetic Shop

*Listener
BorderListener - Spieler können sich nur bis zu einem gewissen Bereich bewegen und werden dann zum Spawn zurück teleportiert (Aus der Map glitchen verhindernt)
DamageListener - Kein Spieler bekommt jeglichen Schaden
GoodWeatherListener - Es scheint immer die Sonne <- In Verbindung mit KeepDayTask
MotdListener - Hier kann die Motd geändert werden
ChatListener - Chat-Farbe der Spieler verändert und Prefix gesetzt je nach Rang (op | not-op)
JoinListener - Einige Dinge passieren, wenn die Person den Server betritt (Items geben, Chat-Nachricht, Title wird gesendet, Tablist wird gesetzt, Herzen auf eins begrenzt...)
QuitListener - Chat-Nachricht, dass jemand verlassen hat
EnderPearlListener - Die Enderperle kommt nach x-Sekunden wieder in dein Inventar

*Weitere Features
Es gibt Rechte, so dass Ihr auch Befehle via Permissions-System vergeben könnt. (siehe plugin.yml)
Es gibt ein Scoreboard, welches Ihr bearbeiten könnt.
Die Tablist wurde völlig gesetzt und kann schnell und einfach verändert werden.
Der Spieler hat, so fern er die richtigen Rechte hat, eine Enderperle (Default), eine Blazerod (/fly | OP), eine Uhr (Navigator | Default), eine Shulker-Kiste (Shop | Default) und einen Netherstar (Speed | OP)
Außerdem hat das Plugin bereits für jedes benutzbare Item einen Sound integriert, so dass das Spiel-Erlebnis gefördert wird
Letztlich gibt es noch eine Bossbar, die völlig verändert werden kann.

Viel Spaß beim ausprobieren und weiter programmieren 

Ps. im target-Ordner findet Ihr das Plugin und könnt es zunächst testen!
