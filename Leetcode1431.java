class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        for(int x:candies){
            max=Math.max(max,x);
        }
        ArrayList<Boolean>list=new ArrayList<>();

        int i=0;
        while(i<candies.length){
            if(candies[i]+extraCandies>=max){
                list.add(true);
            }else{
                list.add(false);
            }
            i++;
        }

        return list;
    }
}