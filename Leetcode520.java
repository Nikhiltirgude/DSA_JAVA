public class Leetcode520 {
    class Solution {
    public boolean detectCapitalUse(String word) {
        boolean isFirstUpper =false;
        int count = 0;
        for(int i = 0 ; i<word.length();i++){
            char ch = word.charAt(i);
            if(ch>='A'&& ch<='Z'){
                count++;
                if(i==0){
                    isFirstUpper=true;
                }
            }
        }

        if(count==1 && isFirstUpper){
            return true;
        }
        else if(count == word.length()){
            return true;
        }
        else if(count ==0){
            return true;
        }
        return false;
        
    }
}
}
