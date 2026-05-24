class Solution {
    public long minimumSteps(String s) {
        long swaps = 0;
        long ones = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '1') {
                ones++;
            } 
            else {
                swaps += ones;
            }
        }

        return swaps;
    }
}