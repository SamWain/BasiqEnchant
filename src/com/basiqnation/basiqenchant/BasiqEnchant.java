package com.basiqnation.basiqenchant;

import java.util.List;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Logger;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;


public class BasiqEnchant extends JavaPlugin {

	public static FileConfiguration config;
	
	public final static Logger logger = Logger.getLogger("Minecraft");
	

	private void startListeners() {
		getServer().getPluginManager().registerEvents(
				new EnchantListener(this), this);
	}

	private void getEnchants() throws FileNotFoundException {
		List<String> list = BasiqEnchant.this.getConfig().getStringList("Banned");
		BasiqEnchantManager.loadArray(list);
	}

	@Override
	public void onEnable() {

		if (!new File(getDataFolder(), "config.yml").exists()) {
			saveDefaultConfig();
		}
		try {
			getEnchants();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		startListeners();
	}

}
