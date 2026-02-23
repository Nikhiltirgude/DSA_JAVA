class Solution {
    
    public int findKthPositive(int[] arr, int k) {
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
               int mis=arr[m]-(m+1);
            if(mis<k){
                l=m+1;
            }else h=m-1;
        }
return l+k;
    }
}