package com.basiqnation.basiqenchant;

import java.util.HashMap;
import java.util.Set;


public class EnchantLevel {

	public static boolean isAllowed(HashMap<String, Integer> e,
			HashMap<String, Integer> m, Set<String> Keys) {
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
