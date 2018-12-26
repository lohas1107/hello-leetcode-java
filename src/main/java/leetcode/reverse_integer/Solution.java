package leetcode.reverse_integer;

public class Solution {

	public int reverse(int x) {
		int reverseX = 0;
		
		while (x != 0) {
			if (Integer.MAX_VALUE / 10 < reverseX || Integer.MIN_VALUE / 10 > reverseX) return 0;
			reverseX = reverseX * 10 + x % 10;
			x /= 10;
		}

		return reverseX;
	}

}
