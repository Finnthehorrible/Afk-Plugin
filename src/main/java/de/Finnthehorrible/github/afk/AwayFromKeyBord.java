package de.Finnthehorrible.github.afk;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AwayFormKeyBord extends JavaPlugin {
    @Override
    public void onEnable(){

    }
    @SuppressWarnings("unused")
    private void registerCommands(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new Plugin(), this);

    }
    @Override
    public void onDisable(){

    }
}
