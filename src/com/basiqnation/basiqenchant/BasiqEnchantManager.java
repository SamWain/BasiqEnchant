package com.basiqnation.basiqenchant;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;

public class BasiqEnchantManager {

	private static ConcurrentHashMap<String, Integer> list = new ConcurrentHashMap<String, Integer>();

	public static void loadArray(ConcurrentHashMap<String, Integer> Enchants) {
		Set<String> set = Enchants.keySet();
		for (String s : set) {
			list.put(s, Enchants.get(s));
		}
	}

	public static void EnchantDisable(ConcurrentHashMap<String, Integer> map,
			EnchantItemEvent event, Player player) {
		Set<String> e = map.keySet();
		for (String en : e) {
			if (list.containsKey(en)) {
				if (!(EnchantLevel.isAllowed(map, list, e))) {
					event.setCancelled(true);

					String error = "";
					if (!BasiqEnchant.message.contains("%enchant%")) {
						error = BasiqEnchant.message;
					} else {
						error = BasiqEnchant.message.replace("%enchant%",
								Format.formatEnchant(en));
					}
					player.sendMessage(ChatColor.DARK_RED + error + " " + map.get(en));
				}
			}
		}
	}

	public static void BookDisable(ConcurrentHashMap<String, Integer> map,
			InventoryClickEvent event, Player player) {
		Set<String> e = map.keySet();
		for (String en : e) {
			if (list.containsKey(en)) {
				if (!(EnchantLevel.isAllowed(map, list, e))) {
					event.setCancelled(true);

					String error = "";
					if (!BasiqEnchant.message.contains("%enchant%")) {
						error = BasiqEnchant.message;
					} else {
						error = BasiqEnchant.message.replace("%enchant%",
								Format.formatEnchant(en));
					}
					player.sendMessage(ChatColor.DARK_RED + error + " " + map.get(en));
				}

			}
		}
	}
}