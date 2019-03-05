package me.goldhaxx.helloworld.me.goldhaxx.helloworld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import me.goldhaxx.helloworld.Main;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelloCommand implements CommandExecutor {

    final Main plugin;

    public HelloCommand(Main plugin){

        this.plugin=plugin;
        plugin.getCommand("hello").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players may execute this command!");
            return true;
        }

        Player p = (Player) sender;

        if (p.hasPermission("hello.use")){
            p.sendMessage("hi!");
            return true;
        }

        p.sendMessage("You don't have permission to execute this command!");

        return false;
    }
}
