class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        // Since locations are up to 1000, we use an array of size 1001
        int[] diff = new int[1001];

        // Apply difference array technique
        for (int[] trip : trips) {
            int passengers = trip[0];
            int start = trip[1];
            int end = trip[2];

            diff[start] += passengers;   // passengers get in
            diff[end] -= passengers;     // passengers get out
        }

        // Prefix sum to check occupancy at each point
        int currentPassengers = 0;
        for (int i = 0; i < diff.length; i++) {
            currentPassengers += diff[i];
            if (currentPassengers > capacity) {
                return false; // capacity exceeded
            }
        }
        return true; // never exceeded capacity
    }
}
