package com.basiqnation.basiqenchant;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.EnchantmentStorageMeta;
import org.bukkit.Material;

public class EnchantListener implements Listener {
	public static BasiqEnchant plugin;
	public final Logger logger = Logger.getLogger("Minecraft");

	public EnchantListener(BasiqEnchant instance) {
		plugin = instance;
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void onEnchant(final EnchantItemEvent event) {
		Map<Enchantment, Integer> Enchants = event.getEnchantsToAdd();
		HashMap<String, Integer> Name = new HashMap<String, Integer>();
		Set<Enchantment> Keys = Enchants.keySet();
		for(Enchantment s: Keys){
			String string = s.getName();
			Integer i = Enchants.get(s);
			Name.put(string, i);
		}
		Player player = event.getEnchanter();
		BasiqEnchantManager.EnchantDisable(Name, event, player);
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public static void onInventoryClick(InventoryClickEvent event) {
		Inventory inv = event.getInventory();
		if (inv instanceof AnvilInventory) {
			AnvilInventory anvil = (AnvilInventory) inv;
			ItemStack[] items = anvil.getContents();
			ItemStack item1 = items[0];
			ItemStack item2 = items[1];
			if (item1 != null && item2 != null) {
				Material id2 = item2.getType();
				if (id2 == Material.ENCHANTED_BOOK) {
					HashMap<String, Integer> Name = new HashMap<String, Integer>();
					EnchantmentStorageMeta meta = (EnchantmentStorageMeta) item2
							.getItemMeta();
					Map<Enchantment, Integer> e = meta.getStoredEnchants();
					Set<Enchantment> Keys = e.keySet();
					Player player = (Player) event.getWhoClicked();
					for(Enchantment s: Keys){
						String string = s.getName();
						Integer i = e.get(s);
						Name.put(string, i);
					}

					if (event.getSlotType() == SlotType.RESULT) {
						BasiqEnchantManager.BookDisable(Name, event, player);
					}
				}
			}
		}
	}

}
