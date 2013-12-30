package com.basiqnation.basiqenchant;

import java.util.Map;
import java.util.Set;

import org.bukkit.enchantments.Enchantment;

public class EnchantLevel {

	public static boolean isAllowed(Map<Enchantment, Integer> e,
			Set<Enchantment> Keys) {
		Integer count = 0;
		for (Enchantment k : Keys) {
			String sk = k.toString();

			switch (sk) {

			case "Enchantment[48, ARROW_DAMAGE]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[50, ARROW_FIRE]" :

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[51, ARROW_INFINITE]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[49, ARROW_KNOCKBACK]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "[16, DAMAGE_ALL]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[18, DAMAGE_ARTHROPODS]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[17, DAMAGE_UNDEAD]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[32, DIG_SPEED]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[34, DURABILITY]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[20, FIRE_ASPECT]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[19, KNOCKBACK]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[35, LOOT_BONUS_BLOCKS]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[21, LOOT_BONUS_MOBS]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[LUCK]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[LURE]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[5, OXYGEN]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[0, PROTECTION_ENVIRONMENTAL]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[3, PROTECTION_EXPLOSIONS]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[2, PROTECTION_FALL]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[1, PROTECTION_FIRE]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[4, PROTECTION_PROJECTILE]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[33, SILK_TOUCH]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[7, THORNS]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			case "Enchantment[6, WATER_WORKER]":

				if (e.get(k) <= 2) {
					count++;
				}
				break;

			}
			if(count == e.size()){
				return true;
			}
		}
		return false;
	}
}
