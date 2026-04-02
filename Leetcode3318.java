import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            Map<Integer, Integer> freq = new HashMap<>();

            // count frequency
            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }

            // create list
            List<int[]> list = new ArrayList<>();
            for (int key : freq.keySet()) {
                list.add(new int[]{key, freq.get(key)});
            }

            // sort by freq desc, value desc
            Collections.sort(list, (a, b) -> {
                if (b[1] != a[1]) return b[1] - a[1];
                return b[0] - a[0];
            });

            // take top x
            int sum = 0;
            for (int j = 0; j < Math.min(x, list.size()); j++) {
                sum += list.get(j)[0] * list.get(j)[1];
            }

            ans[i] = sum;
        }

        return ans;
    }
}