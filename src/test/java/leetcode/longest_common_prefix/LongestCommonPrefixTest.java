package leetcode.longest_common_prefix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        assertEquals("", solution.longestCommonPrefix(new String[] {}));
        assertEquals("a", solution.longestCommonPrefix(new String[] { "a" }));
        assertEquals("", solution.longestCommonPrefix(new String[] { "a", "b" }));
        assertEquals("", solution.longestCommonPrefix(new String[] { "abab","aba","" }));
        assertEquals("fl", solution.longestCommonPrefix(new String[] { "flower","flow","flight" }));
    }

}
