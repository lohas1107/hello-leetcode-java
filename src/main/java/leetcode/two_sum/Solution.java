package leetcode.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numsMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (numsMap.containsKey(target - num)) {
				return new int[] { numsMap.get(target - num), i };
			}
			numsMap.put(num, i);
		}
		
		return new int[] { -1, -1 };
	}

}
