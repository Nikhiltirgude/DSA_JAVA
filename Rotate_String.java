class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String last=goal+goal;
        if(last.contains(s)){
            return true;
        }
        return false;
    }
}