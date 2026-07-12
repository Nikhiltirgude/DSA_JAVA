class Solution {
    public int[] arrayRankTransform(int[] arr) {
      
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr) {
            set.add(num);
        }

        
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : set) {
            rankMap.put(num, rank++);
        }

      
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rankMap.get(arr[i]);
        }

        return arr;
    }
}
