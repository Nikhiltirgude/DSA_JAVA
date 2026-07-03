class Solution {
    public int[] constructTransformedArray(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            int index = (i + nums[i]) % n;

            if (index < 0)
                index += n;

            result[i] = nums[index];
        }

        return result;
    }
}