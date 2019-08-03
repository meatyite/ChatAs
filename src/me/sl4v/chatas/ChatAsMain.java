package me.sl4v.chatas;

import org.bukkit.plugin.java.JavaPlugin;

public class ChatAsMain extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getLogger().info("ChatAs Plugin is now enabled");
        getCommand("chatas").setExecutor(new ChatAsCommand());
    }
}
