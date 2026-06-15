class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int sqsum=0;

        while(n>0){
            int digit=n%10;

            sum=sum+digit;
            sqsum=sqsum+digit*digit;

            n=n/10;
            
        }
        return (sqsum-sum)>=50;
        
    }
}