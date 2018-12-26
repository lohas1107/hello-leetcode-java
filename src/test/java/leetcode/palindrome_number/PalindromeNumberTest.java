package leetcode.palindrome_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

	@Test
	public void test() {
		Solution solution = new Solution();
		assertFalse(solution.isPalindrome(-2147483648));
		assertTrue(solution.isPalindrome(0));
		assertFalse(solution.isPalindrome(10));
		assertTrue(solution.isPalindrome(11));
		assertTrue(solution.isPalindrome(12321));
		assertTrue(solution.isPalindrome(123321));
		assertFalse(solution.isPalindrome(123421));
		assertFalse(solution.isPalindrome(-12321));
		assertFalse(solution.isPalindrome(1534236469));
	}

}
