class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int max = 0;
        hm.put(0, -1);
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                sum -= 1;
            } else {
                sum += 1;
            }

            if (hm.containsKey(sum)) {
                int len = i - hm.get(sum);
                max = Math.max(len, max);
            } else {
                hm.put(sum, i);
            }
        }
        return max;
    }
}