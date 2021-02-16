package me.cautiousknights.playerinfo;

import me.cautiousknights.playerinfo.events.OnDeath;
import me.cautiousknights.playerinfo.events.OnJoin;
import me.cautiousknights.playerinfo.events.OnPlayerLeave;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerInfo extends JavaPlugin implements Listener
{

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.GREEN + "The plugin is now up and running perfectly!");
        getServer().getPluginManager().registerEvents(new OnDeath(), this);
        getServer().getPluginManager().registerEvents(new OnJoin(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerLeave(), this);

    }

}