package com.vip.utils;

import java.util.HashMap;
import java.util.Map;

public class ArrayUtils {
	public int[] removeDuplicates(int[] in) {
		int diff = 0;
		int[] out = null;
		Map<Integer, Integer> lookupMap = null;

		lookupMap = new HashMap<>();

		lookupMap.put(in[0], 0);
		for (int i = 1; i < in.length; i++) {
			if (lookupMap.containsKey(in[i]) == true) {
				continue;
			}
			lookupMap.put(in[i], i);
		}
		out = new int[lookupMap.size()];
		diff = in.length - out.length;
		for (Integer key : lookupMap.keySet()) {
			Integer index = lookupMap.get(key);
			if (index > (out.length - 1)) {
				index = index - (index - (out.length - 1));
			}
			out[index] = key;
		}

		return out;
	}
}
