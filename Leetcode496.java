class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
        
        int[] arr = new int[num1.length];
        
        for(int i = 0; i < num1.length; i++){
            
            int index = -1;
            
            for(int j = 0; j < num2.length; j++){
                if(num1[i] == num2[j]){
                    index = j;
                    break;
                }
            }
            
           
            int nextGreater = -1;
            for(int j = index + 1; j < num2.length; j++){
                if(num2[j] > num1[i]){
                    nextGreater = num2[j];
                    break;
                }
            }
            
            arr[i] = nextGreater;
        }
        
        return arr;
    }
}
