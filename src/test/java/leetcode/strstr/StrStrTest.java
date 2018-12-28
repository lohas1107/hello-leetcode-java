package leetcode.strstr;

import org.junit.Test;

import static org.junit.Assert.*;

public class StrStrTest {

    @Test
    public void test() {
        Solution solution = new Solution();

        assertEquals(0, solution.strStr("hello", ""));
        assertEquals(2, solution.strStr("hello", "ll"));
        assertEquals(-1, solution.strStr("aaaaa", "bba"));
        assertEquals(-1, solution.strStr("aaaaa", "c"));
    }

}