class Solution {
    public boolean isPalindrome(String s) {
        String result=s.toLowerCase();
        String result1=result.replaceAll("[^a-zA-Z0-9]", "");
          int i = 0;
        int j = result1.length() - 1;

        boolean isPalindrome = true;

        while (i < j) {
            if (result1.charAt(i) != result1.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }
        return isPalindrome;

       
    }
        
    }
