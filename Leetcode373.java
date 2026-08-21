class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {

        List<List<Integer>> ans =new ArrayList<>();
        if(nums1.length==0 || nums2.length==0 || k==0){
            return ans;
        }

        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            return Integer.compare(a.sum,b.sum);
        });

        for(int i=0;i<Math.min(nums1.length,k);i++){
            pq.add(new Pair(i,0,nums1,nums2));
        }

        while(k>0 && !pq.isEmpty()){
            Pair temp = pq.remove();
            ans.add(Arrays.asList(nums1[temp.i],nums2[temp.j]));

            if(temp.j+1 < nums2.length ){
                pq.add(new Pair(temp.i,temp.j+1,nums1,nums2));
            }
            k--;
        }

        return ans;
        
    }
}

class Pair{
    int i;
    int j;
    int sum;

    public Pair(int i,int j,int[]nums1,int[]nums2){
        this.i=i;
        this.j=j;
        this.sum=nums1[i]+nums2[j];
    }
}