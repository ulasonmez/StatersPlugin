package me.Blume.ManhuntStart.cmds;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.Blume.ManhuntStart.Main;
import net.md_5.bungee.api.ChatColor;

public class Start implements CommandExecutor{
	static Main plugin;
	public Start(Main main) {
		plugin=main;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		World world = player.getWorld();
		if(label.equals("start")) {
			if(!(sender.isOp())) {
				player.sendMessage(ChatColor.DARK_RED+"Yetkin yok!");
				return true;
			}else {
				world.setTime(0);
				if(args.length==0) {
					for(Player all : Bukkit.getServer().getOnlinePlayers())
					{
					    all.setHealth(20.0);
					    all.setFoodLevel(25);
					}
					return true;
				}
				else {
					player.sendMessage(ChatColor.DARK_RED+"Yanlis kullanim.");
					return true;
				}
			}
		}
		
		
		return false;
	}
	
	
	

}
