class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){       //for checking the last element -->first element(circular array)
                count++;
            }
        }
        return count<=1;
    }
}