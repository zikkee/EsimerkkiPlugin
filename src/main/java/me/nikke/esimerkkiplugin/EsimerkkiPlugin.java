package me.nikke.esimerkkiplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class EsimerkkiPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("ping").setExecutor(new PingCommand());
    }

    @Override
    public void onDisable() {

    }
}
