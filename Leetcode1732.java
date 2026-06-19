class Solution {
    public int largestAltitude(int[] gain) {
         int leftSum=0;
         int max=Integer.MIN_VALUE;

        for(int i=0;i<gain.length;i++){
            leftSum+=gain[i];
            max=Math.max(max,leftSum);
        }

        return Math.max(max,0);
    }