package leetcode.roman_to_integer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Roman2IntegerTest {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertEquals(621, solution.romanToInt("DCXXI"));
		assertEquals(1996, solution.romanToInt("MCMXCVI"));
		assertEquals(3586, solution.romanToInt("MMMDLXXXVI"));
	}

}
