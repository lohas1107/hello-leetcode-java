package leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import leetcode.reverse_integer.Solution;

/**
 * Reverse digits of an integer.
 * Note:
 * The input is assumed to be a 32-bit signed integer. 
 * Your function should return 0 when the reversed integer overflows.
 * @author Yarr
 *
 */
public class ReverseIntegerTest {

	@Test
	public void test() {
		int result;
		Solution solution = new Solution();
		
		result = solution.reverse(123);
		assertEquals(321, result);
		
		result = solution.reverse(-123);
		assertEquals(-321, result);
		
		result = solution.reverse(1);
		assertEquals(1, result);
		
		result = solution.reverse(10);
		assertEquals(1, result);
		
		result = solution.reverse(100);
		assertEquals(1, result);
		
		result = solution.reverse(1534236469);
		assertEquals(0, result);
		
		result = solution.reverse(-2147483648);
		assertEquals(0, result);
	}

}
