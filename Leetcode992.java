class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k) - helper(nums,k-1);
    }

    private int helper(int[]nums,int k){
        int n=nums.length;

        Map<Integer,Integer>hm=new HashMap<>();
        int sp=0;
        int ep=0;
        int count=0;

        while(ep<n){
            //1.Introduce  new person in window
            int curr=nums[ep];
            hm.put(curr,hm.getOrDefault(curr,0)+1);

            //2.Shrink window untill it is invalid
            while(hm.size()>k){
                int remove=nums[sp];

                hm.put(remove,hm.get(remove)-1);
                if(hm.get(remove)==0){
                    hm.remove(remove);
                }
                sp++;
            }

            //3.Calculate ans
            count+=ep-sp+1;

            //4.Expand window
            ep++;
        }
        return count;
    }
}