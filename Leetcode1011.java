class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;

        int low=0;
        int high=0;
        int ans=-1;

        for(int x:weights){
            low=Math.max(x,low);
            high+=x;
        }

        while(low<=high){
            int mid=(low+high)/2;

            if(isPossible(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[]arr,int totalDays,int maxDay){
            int day=1;
           int work=0;

            for(int x:arr){
                if(work+x>maxDay){
                    day++;
                    work=x;

                    if(day>totalDays){
                        return false;
                    }
                }
                else{
                    work+=x;
                }
            }
            return true;
    }
}