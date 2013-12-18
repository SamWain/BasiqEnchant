package com.basiqnation.basiqenchant;

import java.sql.SQLException;

import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EnchantListener implements Listener {
	public static BasiqEnchant plugin;

	public EnchantListener(BasiqEnchant instance) {
		plugin = instance;
	}
}
