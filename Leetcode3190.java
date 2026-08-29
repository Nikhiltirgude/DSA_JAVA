class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++){
            int remaining = nums[i]%3;
            int temp1=0;
            while(remaining!=0){
                remaining--;
                temp1++;
            }

            remaining=nums[i]%3;
            int temp2=0;
            while(remaining%3!=0){
                remaining++;
                temp2++;
            }

            count+=Math.min(temp1,temp2);
        }

        return count;
    }
}