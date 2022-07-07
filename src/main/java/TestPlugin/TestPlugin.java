package TestPlugin;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.*;
import org.spigotmc.*;

public final class TestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        for(Player player : getServer().getOnlinePlayers()){
            player.sendTitle("Hello!", "Plugin Enabled.", 1, 3, 1);
        }

    }

    public void OnFall(){}

    @Override
    public void onDisable() {
        for(Player player : getServer().getOnlinePlayers()){
            player.sendTitle("Bye!", "Plugin Disabling.", 1, 3, 1);
        }
    }
}
