package leetcode.longest_common_prefix;

import java.util.Arrays;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();

        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < first.length; i++) {
            if (first[i] == last[i]) {
                prefix.append(first[i]);
            } else break;
        }

        return prefix.toString();
    }

}
