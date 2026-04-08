class Solution {
    public int minOperations(int n) {
        int sum=0;
      ;
        int target=0;
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(2*i)+1;
            target+=arr[i];
        }
        target=target/n;
        
        for(int i=0;i<n;i++){
            if(arr[i]>target){
                break;
            }
            else{
                sum+=(target-arr[i]);
            }
        }
        return sum;
    }
}