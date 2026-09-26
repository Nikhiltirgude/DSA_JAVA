class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String>hm=new HashMap<>();
        
        for(List<String>list:knowledge){
            hm.put(list.get(0),list.get(1));
        }

        int sp=0;
        int ep=0;
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                sp=i;
                ep=i;
                while(s.charAt(ep)!=')'){
                    ep++;
                }

                if(hm.containsKey(s.substring(sp+1,ep))){
                    ans.append(hm.get(s.substring(sp+1,ep)));
                }else{
                    ans.append('?');
                }
                i=ep;
            }
            else{
                ans.append(ch);
            }
    }
    
    return ans.toString();
}
}