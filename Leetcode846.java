class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer,Integer>hm=new TreeMap<>();

        for(int x : hand){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }

        PriorityQueue<Integer>pq=new PriorityQueue<>(hm.keySet());

        while(!pq.isEmpty()){
            int first=pq.peek();

            for(int i=0;i<groupSize;i++){
                int curr=first+i;

                if(!hm.containsKey(curr)){
                    return false;
                }

                hm.put(curr,hm.get(curr)-1);

                if(hm.get(curr)==0){
                    hm.remove(curr);
                    pq.remove(curr);
                }
            } 
        }
          return true;
    }
}