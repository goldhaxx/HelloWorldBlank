package me.goldhaxx.helloworld.me.goldhaxx.helloworld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import me.goldhaxx.helloworld.Main;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FuckJared implements CommandExecutor {

    final Main plugin;

    public FuckJared(Main plugin2){

        this.plugin=plugin2;
        plugin.getCommand("Praise the sun").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender2, Command cmd2, String label2, String[] args2) {
        if (!(sender2 instanceof Player)) {
            sender2.sendMessage("Only players may execute this command!");
            return true;
        }

        Player p = (Player) sender2;

        if (p.hasPermission("hello.use")){
            p.sendMessage("Fuck you Jared :)");
            return true;
        }

        p.sendMessage("You don't have permission to execute this command!");

        return false;
    }
}
