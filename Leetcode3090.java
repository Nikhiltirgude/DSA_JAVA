class Solution {
    public int maximumLengthSubstring(String s) {

        int[]freq=new int[26];
        int start=0;
        int end=0;
        int max=0;

        while(end<s.length()){
            //1.Introduce new person in window
            freq[s.charAt(end)-'a']++;

            //2.Shrink window untill it is invalid
            while(freq[s.charAt(end)-'a']>2){
                freq[s.charAt(start)-'a']--;
                start++;
            }

            //3.Calculate ans
            max=Math.max(max,end-start+1);

            //4.Expand window
            end++;
        }

        return max;
    }
}