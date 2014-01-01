package com.basiqnation.basiqenchant;

import java.util.HashMap;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;


public class BasiqEnchant extends JavaPlugin {
	
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	public static FileConfiguration config;
	
	public final static Logger logger = Logger.getLogger("Minecraft");
	public static String message = "";

	private void startListeners() {
		getServer().getPluginManager().registerEvents(
				new EnchantListener(this), this);
	}

	private void loadConfig() throws FileNotFoundException {
		
		// get the configured list of enchants
		List<String> list = BasiqEnchant.this.getConfig().getStringList("banned");
		for(String s : list){
			String[] maps = s.split(":");
			Integer i = Integer.parseInt(maps[1]);
			map.put(maps[0], i);
		}
		BasiqEnchantManager.loadArray(map);
		
		// get the configured error message
		this.message = BasiqEnchant.this.getConfig().getString("message");		
	}

	@Override
	public void onEnable() {

		if (!new File(getDataFolder(), "config.yml").exists()) {
			saveDefaultConfig();
		}
		try {
			loadConfig();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		startListeners();
	}

}
