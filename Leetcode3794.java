class Solution {
    public String reversePrefix(String s, int k) {
        String result =new StringBuilder(s.substring(0,k)).reverse().toString()+s.substring(k);
        return result;
        
    }
}