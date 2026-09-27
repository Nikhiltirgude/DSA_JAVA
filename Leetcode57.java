class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int n=intervals.length;
        List<int[]>res=new ArrayList<>();
        int i=0;

        //left most part
        while(i<n && intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i++;
        }

        //All the intervals that is coliding 
        while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        res.add(newInterval);

        //Right most part
        while(i<n){
            res.add(intervals[i]);
            i++;
        }

        int[][]ans=new int[res.size()][2];
        for(int j=0;j<res.size();j++){
            ans[j]=res.get(j);
        }

        return ans;
    }
}