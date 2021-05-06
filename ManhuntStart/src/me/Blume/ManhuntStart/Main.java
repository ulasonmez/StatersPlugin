package me.Blume.ManhuntStart;

import org.bukkit.plugin.java.JavaPlugin;
import me.Blume.ManhuntStart.cmds.Start;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		registerCmds();
	}
	@Override
	public void onDisable() {
		
	}
	
	public void registerCmds() {
	 this.getCommand("start").setExecutor(new Start(this));
	}
	//a
	
}
