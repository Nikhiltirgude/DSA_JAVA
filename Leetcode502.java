class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        List<Pair>project=new ArrayList<>();
        for(int i=0;i<capital.length;i++){
            project.add(new Pair(capital[i],profits[i]));
        }

        project.sort((a,b)->{
          return Integer.compare(a.capital,b.capital);
        });

        PriorityQueue<Integer>maxHeap=new PriorityQueue<>((a,b)->{
            return Integer.compare(b,a);
        });

        int i=0;
        while(k > 0){
            while(i<profits.length && project.get(i).capital <= w){
                maxHeap.add(project.get(i).profit);
                i++;
            }
            
            if(maxHeap.isEmpty()) break;

            w+=maxHeap.remove();
            k--;
        }
        return w;
    }
    
}

class Pair{
    int capital;
    int profit;
    Pair(int capital,int profit){
        this.capital=capital;
        this.profit=profit;
    }
}