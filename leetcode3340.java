class Solution {
    public boolean isBalanced(String num) {
        int odd=0;
        int even=0;

        for(int i=0;i<num.length();i++){
            if(i%2==0){
                char ch=num.charAt(i);
                even+=ch-'0';
            }else{
                char ch=num.charAt(i);
                odd+=ch-'0';
            }
        }

        return odd==even;
    }
}