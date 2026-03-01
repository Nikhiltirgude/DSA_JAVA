class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        int maxLen=0;
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int j=0;

        while(j<s.length()){
            char ch=s.charAt(j);

            if(!set.contains(ch)){
                set.add(ch);
                j++;
                len++;
                maxLen=Math.max(maxLen,len);
            }

            else{
                set.remove(s.charAt(i));
                i++;
                len--;
            }
        }
        return maxLen;
        
    }
}