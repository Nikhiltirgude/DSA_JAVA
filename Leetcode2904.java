class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int sp=0;
        int ep=0;

        int count=0;
        int minLen=Integer.MAX_VALUE;

        int ansSp=-1;
        int ansEp=-1;

        while(ep<s.length()){
            //1.Introduce new person in window
            char ch=s.charAt(ep);
            if(ch=='1'){
                count++;
            }

            //2.Shrink window untill it is invalid
            while(count>k){
                char ch2=s.charAt(sp);
                if(ch2=='1'){
                    count--;
                }
                sp++;
            }

            while (sp <= ep && s.charAt(sp) == '0') {
                sp++;
            }


            //3.Calculate ans
            if(count==k  && s.charAt(sp)=='1'){
                int len=ep-sp+1;
                String candidate= s.substring(sp,ep+1);

                if(len < minLen || (len == minLen  && candidate.compareTo(s.substring(ansSp,ansEp+1)) < 0)){
                    minLen=len;
                    ansSp=sp;
                    ansEp=ep;
                }
            }

            //4.Expand Window
            ep++;
        }

        return ansSp== -1 ? "" : s.substring(ansSp,ansEp+1);
    }
}