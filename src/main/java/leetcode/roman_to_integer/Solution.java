package leetcode.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int max = 0;
        int integer = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (romanMap.get(s.charAt(i)) >= max) {
                integer += romanMap.get(s.charAt(i));
                max = romanMap.get(s.charAt(i));
            } else {
                integer -= romanMap.get(s.charAt(i));
            }
        }

        return integer;
    }

}