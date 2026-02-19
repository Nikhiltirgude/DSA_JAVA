class Solution {
    
    public String reduceString(String s) {
        // Base Case
        if (s.length() == 2) {
            return s;
        }
        StringBuilder next = new StringBuilder();

        for (int i = 0; i < s.length() - 1; i++) {
            int sum = (s.charAt(i) - '0') + (s.charAt(i + 1) - '0');
            next.append(sum % 10);
        }

        // Recursive Call
        return reduceString(next.toString());
    }
    public boolean hasSameDigits(String s) {
        String ans=reduceString(s);
        if(ans.charAt(0)==ans.charAt(1)){
            return true;
        }
        return false;
    }
}