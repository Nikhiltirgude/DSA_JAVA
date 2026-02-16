public class Leetcode2011 {
   
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0 ;
        int n = operations.length;

        for(int i =0 ;i<n;i++){
            if(operations[i].charAt(1)=='+'){
                ans++;
            }
            else{
                ans--;
            }
        }
        return ans;
    }
}

