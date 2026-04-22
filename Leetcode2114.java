class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;

        for(String s:sentences){
            int count=1;
            for(char ch:s.toCharArray()){
                if(ch==' '){
                    count++;
                }
            }
            max=Math.max(count,max);
        }

        return max;
        
    }
}