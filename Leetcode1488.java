import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        
        Map<Integer, Integer> lakeMap = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                ans[i] = 1; // temporary
            } else {
                int lake = rains[i];
                ans[i] = -1;

                if (lakeMap.containsKey(lake)) {
                    int lastFilled = lakeMap.get(lake);

                    Integer dryDay = dryDays.higher(lastFilled);
                    if (dryDay == null) {
                        return new int[0]; // flood unavoidable
                    }

                    ans[dryDay] = lake;
                    dryDays.remove(dryDay);
                }

                lakeMap.put(lake, i);
            }
        }
        return ans;
    }
}