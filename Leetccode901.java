import java.util.*;

class StockSpanner {

    Stack<Integer> st;
    ArrayList<Integer> arr;

    public StockSpanner() {
        st = new Stack<>();
        arr = new ArrayList<>();
    }
    
    public int next(int price) {
        arr.add(price);
        int i = arr.size() - 1;

        while (!st.isEmpty() && arr.get(i) >= arr.get(st.peek())) {
            st.pop();
        }

        int span;
        if (!st.isEmpty()) {
            span = i - st.peek();
        } else {
            span = i + 1;
        }

        st.push(i);
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */