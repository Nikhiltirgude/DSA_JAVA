class Solution {

    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];

        return dfs(arr, start, visited);
    }

    private boolean dfs(int[] arr, int idx, boolean[] visited) {

        // out of bounds
        if (idx < 0 || idx >= arr.length) {
            return false;
        }

        // already visited
        if (visited[idx]) {
            return false;
        }

        // found zero
        if (arr[idx] == 0) {
            return true;
        }

        visited[idx] = true;

        int forward = idx + arr[idx];
        int backward = idx - arr[idx];

        return dfs(arr, forward, visited) ||
               dfs(arr, backward, visited);
    }
}