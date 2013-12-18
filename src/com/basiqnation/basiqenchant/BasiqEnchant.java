package com.basiqnation.basiqenchant;


import org.bukkit.plugin.java.JavaPlugin;

public class BasiqEnchant extends JavaPlugin {

	private void startListeners() {
		getServer().getPluginManager().registerEvents(new EnchantListener(this), this);
	}

	@Override
	public void onEnable() {
		startListeners();
	}

}
