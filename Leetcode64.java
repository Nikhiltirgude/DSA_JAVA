class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        
        int[][]dp=new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }

        return helper(grid,0,0,dp);
    }

    private int helper(int[][]arr,int i,int j,int[][]dp){
        int m=arr.length;
        int n=arr[0].length;

        if(i==m-1 && j==n-1){
            return arr[i][j];
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(i == m-1){
            dp[i][j]=arr[i][j]+helper(arr,i,j+1,dp);
            return dp[i][j];
        }

        if(j==n-1){
            dp[i][j]=arr[i][j]+helper(arr,i+1,j,dp);
            return dp[i][j];
        }

        int right = helper(arr,i+1,j,dp);
        int down=helper(arr,i,j+1,dp);

        dp[i][j]=arr[i][j]+Math.min(right,down);
        return dp[i][j];
    }
}