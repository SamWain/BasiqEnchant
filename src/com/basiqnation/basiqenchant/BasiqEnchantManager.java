package com.basiqnation.basiqenchant;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.enchantment.EnchantItemEvent;

public class BasiqEnchantManager {

	private static ArrayList<Enchantment> list = new ArrayList<Enchantment>();

	public static void loadArray(List<String> Enchants) {
		for (String enchants : Enchants) {
			Enchantment enchant = Enchantment.getByName(enchants);
			list.add(enchant);
		}
	}

	public static void EnchantDisable(Set<Enchantment> e, ItemStack item,
			EnchantItemEvent event) {
		if (list.contains(e)) {
			event.setCancelled(true);

		}
	}

}
