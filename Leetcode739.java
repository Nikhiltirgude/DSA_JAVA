class Solution {
    public int[] dailyTemperatures(int[] nums) {
        int[]ans=new int[nums.length];
        Stack<Integer>st=new Stack<>();
        
        for(int i=nums.length-1;i>=0;i--){

            while(!st.empty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }

            if(st.empty()){
                ans[i]=0;
            }else{
                ans[i]=st.peek()-i;
            }

            st.push(i);
        }
        return ans;
    }
}