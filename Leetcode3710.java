class Solution {
    public int alternatingSum(int[] nums) {
        int even=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                even+=nums[i];
            }
            else{
                even-=nums[i];
            }
        }
        return even;
    }
}