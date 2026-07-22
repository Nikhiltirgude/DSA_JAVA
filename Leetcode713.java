class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if(k==0) return 0;
        int sp=0;   //starting point
        int ep=0;   //ending point

        int currWindowPro=1;
        int ans=0;

        while(ep<nums.length){
            //1.Introduce new person in window
            currWindowPro*=nums[ep];

            //2.Shrink window until it is invalid
            while(currWindowPro >= k && sp<=ep){
                currWindowPro/=nums[sp];
                sp++;
            }

            //3.Calculate ans
            ans+=ep-sp+1;

            //4.Expand window
            ep++;
        }

        return ans;
    }
}