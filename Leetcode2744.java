class Solution {
    public static String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
            return  sb.toString();
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int maxCount=0;
        HashSet<String>set=new HashSet<>();
       for(String ch:words){

        if(set.contains(reverse(ch))){
            maxCount++;
            set.remove(reverse(ch));
        }else{
            set.add(ch);
        }
       }
       return maxCount;
    }
}