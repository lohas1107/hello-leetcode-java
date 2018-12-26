package leetcode.valid_parentheses;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void test() {
        Solution solution = new Solution();
        assertTrue(solution.isValid("()[]{}"));
        assertTrue(solution.isValid("([])"));
        assertFalse(solution.isValid("["));
        assertFalse(solution.isValid("(]"));
        assertFalse(solution.isValid("){"));
        assertFalse(solution.isValid("([)"));
        assertFalse(solution.isValid("([)]"));
    }

}
