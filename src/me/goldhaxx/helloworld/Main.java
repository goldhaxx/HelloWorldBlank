package me.goldhaxx.helloworld;

import me.goldhaxx.helloworld.me.goldhaxx.helloworld.commands.HelloCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin  {

    @Override
    public void onEnable(){

        new HelloCommand(this);

    }

}

/*comment*/
