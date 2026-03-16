class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int high=0;
        int ans=-1;

        for(int x:nums){
            low=Math.max(x,low);
            high+=x;
        }

        while(low<=high){
            int mid=(low+high)/2;

            if(isPossible(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[]arr,int k,int maxArr){
        int sp=1;
        int con=0;

        for(int x:arr){

            if(con+x>maxArr){
                sp++;
                con=x;

                if(sp>k){
                    return false;
                }
            }
            else{
                con+=x;
            }
        }
        return true;
    }
}