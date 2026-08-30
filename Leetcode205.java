class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length()) return false;

        Map<Character,Character>hm1=new HashMap<>();
        Map<Character,Character>hm2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char ch2=t.charAt(i);

            if(hm1.containsKey(ch) && hm1.get(ch)!=ch2){
                return false;
            }

            if(hm2.containsKey(ch2) && hm2.get(ch2)!=ch){
                return false;
            }
            hm1.put(ch,ch2);
            hm2.put(ch2,ch);
        }

        return true;
        
    }
}