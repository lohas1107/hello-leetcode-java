package leetcode.two_sum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * @author Yarr
 *
 */
public class TwoSumTest {

	@Test
	public void test() {
		int[] result;
		Solution solution = new Solution();
		
		result = solution.twoSum(new int[] { 2, 7, 11, 15 }, 9);
		assertEquals(0, result[0]);
		assertEquals(1, result[1]);
		
		result = solution.twoSum(new int[] { 2, 7, 11, 15 }, 10);
		assertEquals(-1, result[0]);
		assertEquals(-1, result[1]);
		
		result = solution.twoSum(new int[] { 2, 3, 3, 15 }, 6);
		assertEquals(1, result[0]);
		assertEquals(2, result[1]);
	}

}
