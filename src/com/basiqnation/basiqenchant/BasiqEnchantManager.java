package com.basiqnation.basiqenchant;

import java.util.HashMap;
import java.util.Set;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;

public class BasiqEnchantManager {

	private static HashMap<String, Integer> list = new HashMap<String, Integer>();
	private static Integer count = 0;
	private static Player player;

	public static void loadArray(HashMap<String, Integer> Enchants) {
		Set<String> set = Enchants.keySet();
		for (String s : set) {
			list.put(s, Enchants.get(s));
		}
	}

	public static void EnchantDisable(HashMap<String, Integer> map,
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
					player.sendMessage(ChatColor.DARK_RED + error + " "
							+ map.get(en));
				}
			}
		}
	}
	
	public static void getPlayer(Player p){
		player = p;
	}
	
	public static void onClose(Player p){
		if(p == player){
			count = 0;
		}
	}

	public static void BookDisable(HashMap<String, Integer> map,
			InventoryClickEvent event, Player player)
			throws InterruptedException {
		Set<String> e = map.keySet();
		for (String en : e) {
			if (list.containsKey(en)) {
				if (!(EnchantLevel.isAllowed(map, list, e))) {
					count++;
					getPlayer(player);
					if (count > 3) {
						player.closeInventory();
					} else {
						event.setCancelled(true);

						String error = "";
						if (!BasiqEnchant.message.contains("%enchant%")) {
							error = BasiqEnchant.message;
						} else {
							error = BasiqEnchant.message.replace("%enchant%",
									Format.formatEnchant(en));
						}
						player.sendMessage(ChatColor.DARK_RED + error + " "
								+ map.get(en));
					}
				}

			}
		}
	}
}