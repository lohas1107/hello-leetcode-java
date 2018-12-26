package leetcode.palindrome_number;

public class Solution {

	public boolean isPalindrome(int x) {
		int tempX = x;
        int reverseX = 0;

        while (tempX > 0) {
            reverseX = reverseX * 10 + tempX % 10;
            tempX /= 10;
        }

        return x == reverseX;
    }

}
