class Solution {
    public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);   // required for two pointer

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                return true;
            }
            i++;
        }
        return false;
       
    }
}