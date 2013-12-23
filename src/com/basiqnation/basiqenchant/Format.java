package com.basiqnation.basiqenchant;

public class Format {
	
	public static String formatEnchant(String enchant){
		String formattedEnchant = "";
		switch (enchant){
		case "ARROW_DAMAGE":
			formattedEnchant = "Power";
			break;
		case "ARROW_FIRE":
			formattedEnchant = "Flame";
			break;
		case "ARROW_INFINITE":
			formattedEnchant = "Infinity";
			break;
		case "ARROW_KNOCKBACK":
			formattedEnchant = "Punch";
			break;
		case "DAMAGE_ALL":
			formattedEnchant = "Sharpness";
			break;
		case "DAMAGE_ARTHROPODS":
			formattedEnchant = "Bane of Arthropods";
			break;
		case "DAMAGE_UNDEAD":
			formattedEnchant = "Smite";
			break;
		case "DIG_SPEED":
			formattedEnchant = "Efficiency";
			break;
		case "DURABILITY":
			formattedEnchant = "Unbreaking";
			break;
		case "FIRE_ASPECT":
			formattedEnchant = "Fire Aspect";
			break;
		case "KNOCKBACK":
			formattedEnchant = "Knockback";
			break;
		case "LOOT_BONUS_BLOCKS":
			formattedEnchant = "Fortune";
			break;
		case "LOOT_BONUS_MOBS":
			formattedEnchant = "Looting";
			break;
		case "LUCK":
			formattedEnchant = "Luck of the Sea";
			break;
		case "LURE":
			formattedEnchant = "Lure";
			break;
		case "OXYGEN":
			formattedEnchant = "Respiration";
			break;
		case "PROTECTION_ENVIRONMENTAL":
			formattedEnchant = "Protection";
			break;
		case "PROTECTION_EXPLOSIONS":
			formattedEnchant = "Blast Protection";
			break;
		case "PROTECTION_FALL":
			formattedEnchant = "Feather Falling";
			break;
		case "PROTECTION_FIRE":
			formattedEnchant = "Fire Protection";
			break;
		case "PROTECTION_PROJECTILE":
			formattedEnchant = "Projectile Protection";
			break;
		case "SILK_TOUCH":
			formattedEnchant = "Silk Touch";
			break;
		case "THORNS":
			formattedEnchant = "Thorns";
			break;
		case "WATER_WORKER":
			formattedEnchant = "Aqua Affinity";
			break;
		
		
		}		
		return formattedEnchant;
		
	}
	
}
