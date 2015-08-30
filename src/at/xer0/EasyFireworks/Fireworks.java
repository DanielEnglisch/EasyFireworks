package at.xer0.EasyFireworks;


import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import at.xer0.EasyFireworks.Manager.CommandManager;
import at.xer0.EasyFireworks.Manager.ConfigManager;
import at.xer0.EasyFireworks.Manager.EventManager;
import at.xer0.EasyFireworks.Manager.FileManager;
import at.xer0.EasyFireworks.util.GlobalVars;


public class Fireworks extends JavaPlugin implements Listener
{
	
	public void onEnable()
	{

		getCommand("fw").setExecutor(new CommandManager());
		FileManager.loadDispensers();
		getServer().getPluginManager().registerEvents(new EventManager(), this);
		
		ConfigManager.loadConfig();
		
	

	}
	
	public void onDisable()
	{
		GlobalVars.updateAvariable = false;
		GlobalVars.notifiedPlayers.clear();
	}
	
	 
	
}



