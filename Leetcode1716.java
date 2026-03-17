class Solution {
    public int totalMoney(int n) {
        int monday=1;
        int count=1;
        int amount=0;
        int i=1;
        while(i<=n){
            amount+=count;
            if(i%7==0){
                monday++;
                count=monday;
            }else{
                count++;
            }
            
            

            i++;

        }
        return amount;
    }
}