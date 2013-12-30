package com.basiqnation.basiqenchant;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.inventory.InventoryClickEvent;

public class BasiqEnchantManager {

	private static ArrayList<Enchantment> list = new ArrayList<Enchantment>();

	public static void loadArray(List<String> Enchants) {
		for (String enchants : Enchants) {
			Enchantment enchant = Enchantment.getByName(enchants);
			BasiqEnchant.logger.info(enchant.toString());
			list.add(enchant);
		}
	}

	public static void EnchantDisable(Map<Enchantment, Integer> map,
			Set<Enchantment> e, EnchantItemEvent event, Player player) {
		for (Enchantment en : e) {
			if (list.contains(en)) {
				if (!(EnchantLevel.isAllowed(map, e))) {
					event.setCancelled(true);

					String error = "";
					if (!BasiqEnchant.message.contains("%enchant%")) {
						error = BasiqEnchant.message;
					} else {
						error = BasiqEnchant.message.replace("%enchant%",
								Format.formatEnchant(en.getName()));
					}
					player.sendMessage(ChatColor.DARK_RED + error);
				}
			}
		}
	}

	public static void BookDisable(Set<Enchantment> e,
			InventoryClickEvent event, Player player) {
		for (Enchantment en : e) {
			if (list.contains(en)) {
				event.setCancelled(true);

				String error = "";
				if (!BasiqEnchant.message.contains("%enchant%")) {
					error = BasiqEnchant.message;
				} else {
					error = BasiqEnchant.message.replace("%enchant%",
							Format.formatEnchant(en.getName()));
				}
				player.sendMessage(ChatColor.DARK_RED + error);

			}
		}
	}
}