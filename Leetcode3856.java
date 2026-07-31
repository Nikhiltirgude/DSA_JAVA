class Solution {
    public String trimTrailingVowels(String s) {
        int n=s.length();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
            else{
                break;
            }
        }

        return s.substring(0,n-count);
    }
}