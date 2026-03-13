import java.util.*;
class Solution {
    public int hIndex(int[] citations) {
        int count=0;
       Arrays.sort(citations);
        int n=citations.length;
        for(int i=0;i<n;i++){
            if(citations[n-1-i]>=i+1){
                count++;
            }
        }
        return count;
    }
}