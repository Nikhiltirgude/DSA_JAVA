class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        
        String[] words = sentence.split(" ");
        
        for(int i = 0; i < words.length; i++){
            
            String best = words[i];
            
            for(String root : dictionary){
                
                if(words[i].startsWith(root)){
                    
                    if(root.length() < best.length()){
                        best = root;
                    }
                }
            }
            
            words[i] = best;
        }
        
        return String.join(" ", words);
    }
}