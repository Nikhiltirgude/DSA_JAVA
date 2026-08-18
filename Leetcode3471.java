import java.util.*;

class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;

        // Case 1: k == 1
        if (k == 1) {
            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : nums) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
            int ans = -1;
            for (int num : freq.keySet()) {
                if (freq.get(num) == 1) {
                    ans = Math.max(ans, num);
                }
            }
            return ans;
        }

        // Case 2: k == n
        if (k == n) {
            int ans = Integer.MIN_VALUE;
            for (int num : nums) {
                ans = Math.max(ans, num);
            }
            return ans;
        }

        // Case 3: 1 < k < n
        int first = nums[0];
        int last = nums[n - 1];

        int countFirst = 0, countLast = 0;
        for (int num : nums) {
            if (num == first) countFirst++;
            if (num == last) countLast++;
        }

        if (countFirst == 1 && countLast == 1) {
            return Math.max(first, last);
        } else if (countFirst == 1) {
            return first;
        } else if (countLast == 1) {
            return last;
        } else {
            return -1;
        }
    }
}
