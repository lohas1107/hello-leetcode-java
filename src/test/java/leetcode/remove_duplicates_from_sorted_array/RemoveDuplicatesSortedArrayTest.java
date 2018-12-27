package leetcode.remove_duplicates_from_sorted_array;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesSortedArrayTest {

    @Test
    public void test() {

        Solution solution = new Solution();

        assertEquals(0, solution.removeDuplicates(new int[] { }));
        assertEquals(2, solution.removeDuplicates(new int[] { 1, 1, 2 }));
        assertEquals(5, solution.removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }));
    }
}