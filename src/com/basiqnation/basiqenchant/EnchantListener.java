package com.basiqnation.basiqenchant;

import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.inventory.ItemStack;

public class EnchantListener implements Listener {
	public static BasiqEnchant plugin;
	public final Logger logger = Logger.getLogger("Minecraft");

	public EnchantListener(BasiqEnchant instance) {
		plugin = instance;
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void onEnchant(final EnchantItemEvent event) {
		Map<Enchantment, Integer> Enchants = event.getEnchantsToAdd();
		event.getHandlers();
		ItemStack item = event.getItem();
		Set<Enchantment> Keys = Enchants.keySet();
		BasiqEnchantManager.EnchantDisable(Keys, item, event);
	}
}
