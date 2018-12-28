package leetcode.strstr;

class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            if (haystack.length() - i < needle.length()) return -1;

            for (int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (haystack.charAt(i+j) != needle.charAt(j)) break;
            }
        }
    }
}
