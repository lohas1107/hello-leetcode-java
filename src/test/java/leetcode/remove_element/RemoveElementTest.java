package leetcode.remove_element;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementTest {

    @Test
    public void test() {

        Solution solution = new Solution();

        assertEquals(2, solution.removeElement(new int[] { 3, 2, 2, 3 }, 3));
        assertEquals(5, solution.removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
    }
}