class Solution {
    public int minOperations(String s) {
        int changeStart0 = 0;
        int changeStart1 = 0;

        for(int i = 0; i < s.length(); i++){
            
            // pattern starting with 0 -> 010101
            char expected0 = (i % 2 == 0) ? '0' : '1';
            if(s.charAt(i) != expected0){
                changeStart0++;
            }

            // pattern starting with 1 -> 101010
            char expected1 = (i % 2 == 0) ? '1' : '0';
            if(s.charAt(i) != expected1){
                changeStart1++;
            }
        }

        return Math.min(changeStart0, changeStart1);
    }
}