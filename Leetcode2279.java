class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int i=0;
        while(i<capacity.length){
            capacity[i]=(capacity[i]-rocks[i]);
            i++;
        }
        Arrays.sort(capacity);
         int maxCapacity=0;
        for(int j=0;j<capacity.length;j++){ 
            if(capacity[j]<=additionalRocks){
                maxCapacity++;
                additionalRocks-=capacity[j];
            }

        }
       
        
        return maxCapacity;
    }
}