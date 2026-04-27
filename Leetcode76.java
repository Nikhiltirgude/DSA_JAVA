import java.util.*;

class Solution {
     
    public String minWindow(String s, String t) {

        Map<Character, Integer> tmap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            tmap.put(ch, tmap.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> smap = new HashMap<>();

        int start = 0, end = 0;
        int match = 0;   // matched characters count
        int required = t.length();

        int minLen = Integer.MAX_VALUE;
        int ansStart = -1;

        while (end < s.length()) {

            // 1️ Expand
            char ch = s.charAt(end);
            smap.put(ch, smap.getOrDefault(ch, 0) + 1);

            if (tmap.containsKey(ch) &&
                smap.get(ch) <= tmap.get(ch)) {
                match++;
            }

            end++;

            // 2️ Shrink
            while (match == required) {

                if (end - start < minLen) {
                    minLen = end - start;
                    ansStart = start;
                }

                char left = s.charAt(start);
                smap.put(left, smap.get(left) - 1);

                if (tmap.containsKey(left) &&
                    smap.get(left) < tmap.get(left)) {
                    match--;
                }

                start++;
            }
        }

        return ansStart == -1 ? "" : s.substring(ansStart, ansStart + minLen);
    }
}