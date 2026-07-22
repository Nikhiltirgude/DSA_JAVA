class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
            return b.freq-a.freq;
        });

        Map<Integer,Integer>hm=new HashMap<>();
        for(int x : nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }

        for(int key:hm.keySet()){
            pq.add(new Pair(key,hm.get(key)));
        }

        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.remove().element;
        }

        return ans;
    }
}

class Pair{
    int element;
    int freq;
    Pair(int element,int freq){
        this.element=element;
        this.freq=freq;
    }
}