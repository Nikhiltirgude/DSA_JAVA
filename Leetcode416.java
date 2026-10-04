class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;

        for(int x : nums){
            sum+=x;
        }

        if(sum%2!=0) return false;

        return isSubsetSum(nums,sum/2);
    }

    public boolean isSubsetSum(int[] arr, int target) {
      int n=arr.length;
      int[][]dp=new int[n][target+1];

      for(int i=0;i<n;i++){
        for(int j=0;j<target+1;j++){
            dp[i][j]=-1;
        }
      }
      
      return helper(arr,n-1,target,dp);
    }

    private boolean helper(int[]arr,int idx,int target,int[][]dp){

        if(target==0) return true;
        if(idx==0) return arr[0]==target;

        if(dp[idx][target]!=-1) return dp[idx][target]==1;

        boolean notTake=helper(arr,idx-1,target,dp);
        boolean take=false;
        if(target>=arr[idx]){
            take=helper(arr,idx-1,target-arr[idx],dp);
        }

        dp[idx][target]= take || notTake ? 1 : 0 ;

        return dp[idx][target]==1;
    }
    
}