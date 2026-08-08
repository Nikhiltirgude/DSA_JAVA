class Solution {
    public int totalFruit(int[] fruits) {
        
        Map<Integer,Integer>hm=new HashMap<>();
        int start=0;
        int end=0;
        int maxLen=0;

        while(end < fruits.length){
            //1.Introduce new person in the window
            hm.put(fruits[end],hm.getOrDefault(fruits[end],0)+1);

            //2. Shrink window untill invalid
            while(hm.size() > 2 ){
                hm.put(fruits[start],hm.get(fruits[start])-1);
                if(hm.get(fruits[start])==0){
                    hm.remove(fruits[start]);
                }
                start++;
            }

            //3. Perfom calculation
            maxLen=Math.max(maxLen,end-start+1);

            //4.Expand Window
            end++;

        }

        return maxLen;
    }
}