class Solution {
    public long countSubstrings(String s, char c) {

        long subsCount = 0;
        long count=0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == c) {
                count++;
               subsCount+=count;
               
            }
        }

        return subsCount;

    }
}