//   https://leetcode.com/problems/online-stock-span




class StockSpanner {
    ArrayList<Integer> list;
    Stack<Integer> st;
    public StockSpanner() {
        list = new ArrayList<Integer>();
        st = new Stack<>();
    }
    
    public int next(int price) {
        while(st.size() > 0 && list.get(st.peek()) <= price)
        {
            st.pop();
        }
        list.add(price);
        if(st.size()==0)
        {
            st.push(list.size()-1);
            return list.size();
        }
        else{
            int val= st.peek();
            st.push(list.size()-1);
            return list.size()-1-val;
        }
        
    }
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

