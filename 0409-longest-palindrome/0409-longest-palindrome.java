
import java.util.*;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = 0;
        boolean oddFound = false;

        for (int freq : map.values()) {
            count += (freq / 2) * 2;

            if (freq % 2 == 1) {
                oddFound = true;
            }
        }

        if (oddFound) count++;

        return count;
    }
}
