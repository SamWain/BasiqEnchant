package com.basiqnation.basiqenchant;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class EnchantLevel {

	public static boolean isAllowed(ConcurrentHashMap<String, Integer> e,
			ConcurrentHashMap<String, Integer> m, Set<String> Keys) {
		Integer count = 0;
		
		for (String k : Keys) {
			if (e.get(k) != null && m.get(k) != null) {
				if (m.containsKey(k)) {
					if (e.get(k) <= m.get(k)) {
						count++;
					}
					if (count == e.size()) {
						return true;
					} else {
						return false;
					}
				}
			}
		}
		return false;
	}
	
}
