class Solution {
    public int lengthOfLastWord(String s) {
        String result=s.trim();
        int count=0;
        for(int i=result.length()-1;i>=0;i--){
            char ch=result.charAt(i);
            if(ch==' '){
                break;
            }
            count++;

        }
        return count;
    }
}