class Solution {
    public boolean check(int[] piles , int speed , int h){
        long hour = 0; 
        for(int pile : piles){
            // Math.ceil(a/b) = (a+b-1)/b
            hour += (pile + speed -1 )/speed;
        }
        return hour<=h ; 
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1; // Since koko has to eat 1 banana minimum 
        int high = Integer.MIN_VALUE; 
        for(int ele : piles) high = Math.max(ele,high); 

        int ans = high ; 

        while(low<=high){
            int mid = low + (high - low)/2 ;
            if(check(piles, mid, h)){
                ans = mid; 
                high = mid-1; 
            }else{
                low = mid + 1;
            }
        }
        return ans ;
    }
}