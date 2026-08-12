import java.util.HashMap;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            // Add current element to frequency map
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            // If frequency exceeds k, shrink window from left
            while (freq.get(nums[right]) > k) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                left++;
            }

            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
