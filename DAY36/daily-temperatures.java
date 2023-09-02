//   https://leetcode.com/problems/daily-temperatures




class Solution {
    public int[] dailyTemperatures(int[] t) {
       Stack<Integer> st = new Stack<>();
       int n=t.length;
       //array of integer contains 0 as default value 
       //so if assignment of number is left then it will be 0 in result
       int[] res = new int[n];
       

//storing and working on the indexes of temps array
       for(int i=0;i<n;i++) 
       {
           //storing value at st.peek() index of res array
           //after that poping that index
            //and checking got next value in stack 
           while(!st.isEmpty() && t[i]>t[st.peek()])
           {
               res[st.peek()] = i-st.peek();
               st.pop();
           }
          
                 
           st.push(i);
       }
    return res;
    }
}