class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
      int max=-1;
        int[]first=new int[26];
        Arrays.fill(first,-1);

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(first[ch-'a']==-1){
                first[ch-'a']=i;
            }
            else{
                max=Math.max(max,i-first[ch-'a']-1);
            }
        }
      
      return max;
    }
}