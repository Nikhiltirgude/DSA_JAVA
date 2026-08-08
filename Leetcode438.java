class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        Map<Character, Integer> pCount = new HashMap<>();
        Map<Character, Integer> sCount = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            pCount.put(ch, pCount.getOrDefault(ch, 0) + 1);
        }

        int start = 0;
        int end = 0;
        int maxWindow = p.length();

        while (end < s.length()) {
            //1.Introduce new person in window
            char ch = s.charAt(end);
            sCount.put(ch, sCount.getOrDefault(ch, 0) + 1);

            //2.Shrink window untill invalid window
            while ((end - start + 1) > maxWindow) {
                char ch2 = s.charAt(start);
                sCount.put(ch2, sCount.getOrDefault(ch2, 0) - 1);

                if (sCount.get(ch2) == 0) {
                    sCount.remove(ch2);
                }

                start++;
            }

            //3.Calculate ans
            if (end - start + 1 == maxWindow && sCount.equals(pCount)) {
                ans.add(start);
            }

            //4.Expand window
            end++;
        }

        return ans;
    }
}