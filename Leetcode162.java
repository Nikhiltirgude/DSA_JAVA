class Solution {
    public int findPeakElement(int[] arr) {
         int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Increasing slope
                low = mid + 1;
            } else {
                // Decreasing slope
                high = mid;
            }
        }

        return low;
    }
}