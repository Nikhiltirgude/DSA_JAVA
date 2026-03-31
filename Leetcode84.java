class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        
        int[] prev = prevSmaller(heights);
        int[] next = nextSmaller(heights);
        
        int maxArea = 0;
        
        for(int i = 0; i < n; i++) {
            int width = next[i] - prev[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        
        return maxArea;
    }
    
    // Previous Smaller Element Index
    public int[] prevSmaller(int[] arr) {
        int n = arr.length;
        int[] prev = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            
            if(st.isEmpty()) prev[i] = -1;
            else prev[i] = st.peek();
            
            st.push(i);
        }
        
        return prev;
    }

     // Next Smaller Element Index
    public int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] next = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for(int i = n - 1; i >= 0; i--) {
            
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            
            if(st.isEmpty()) next[i] = n;
            else next[i] = st.peek();
            
            st.push(i);
        }
        
        return next;
    }
        
    }
