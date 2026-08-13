class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26]; 
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        int maxVowel = 0;
        int maxCons = 0;

        // Check vowels and consonants 
        for (int i = 0; i < 26; i++) {
            char ch = (char) (i + 'a');
            if (isVowel(ch)) {
                maxVowel = Math.max(maxVowel, freq[i]);
            } else {
                maxCons = Math.max(maxCons, freq[i]);
            }
        }

        return maxVowel + maxCons;
    }

    //check vowels
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}