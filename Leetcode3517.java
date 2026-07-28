

class Solution {
    public String smallestPalindromicPermutation(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        char middle = 0;

        for (int i = 0; i < 26; i++) {
            int count = freq[i];
            if (count % 2 == 1 && middle == 0) {
                middle = (char) (i + 'a'); // pick the smallest odd char
            }
            for (int j = 0; j < count / 2; j++) {
                left.append((char) (i + 'a'));
            }
        }

        StringBuilder right = new StringBuilder(left).reverse();
        if (middle != 0) {
            return left.toString() + middle + right.toString();
        } else {
            return left.toString() + right.toString();
        }
    }
}
