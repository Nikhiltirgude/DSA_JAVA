class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Map<Integer,Integer>hm=new TreeMap<>();
        int[]ans=new int[2];

        for(int x:nums){
            int oldval=hm.getOrDefault(x,0);
            hm.put(x,oldval+1);
        }
        int i=0;
        for(int key:hm.keySet()){
            if(hm.get(key)>1){
                ans[i++]=key;
            }
        }
        return ans;
        
    }
}