class Solution {
    public boolean checkStrings(String s1, String s2) {
        
        int[][] freq = new int[2][26]; // 0 = even, 1 = odd
        
        for (int i = 0; i < s1.length(); i++) {
            int idx = i % 2;
            
            freq[idx][s1.charAt(i) - 'a']++;
            freq[idx][s2.charAt(i) - 'a']--;
        }
        
        // check all counts
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 26; j++) {
                if (freq[i][j] != 0) return false;
            }
        }
        
        return true;
    }
}