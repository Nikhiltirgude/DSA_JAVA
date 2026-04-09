class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];


        for (int i = 0; i < n; i++) {   //saare ko 1-1 candy de do
            candies[i] = 1;
        }

       
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;   //left to right calculate kr lo
            }
        }

      
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);   //right to left calculate kr lo
            }
        }

     
        int total = 0;
        for (int c : candies) {             //total sum
            total += c;
        }

        return total;
    }
}