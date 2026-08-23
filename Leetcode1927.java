class Solution {
    public boolean sumGame(String num) {
        int leftSum=0;
        int rightSum=0;

        int q1=0;
        int q2=0;

        for(int i=0;i<num.length()/2;i++){
            char ch = num.charAt(i);
            if(ch!='?'){
                leftSum+=ch-'0';
            }else{
                q1++;
            }
        }
        for(int i=num.length()/2;i<num.length();i++){
            char ch = num.charAt(i);
            if(ch!='?'){
                rightSum+=ch-'0';
            }
            else{
                q2++;
            }
        }

        if((q1+q2)%2==1) return true;

        int diff=leftSum-rightSum;
        int qdiff=q2-q1;

        return diff !=(qdiff * 9)/2;
    }
}